package virtualChessboard;

import java.util.Scanner;

public class VirtualChess {

	public enum Chessmen {
		WHITE_KING,
		WHITE_QUEEN,
		WHITE_ROOK,
		WHITE_BISHOP,
		WHITE_KNIGHT,
		WHITE_PAWN,

		BLACK_KING,
		BLACK_QUEEN,
		BLACK_ROOK,
		BLACK_BISHOP,
		BLACK_KNIGHT,
		BLACK_PAWN,

		EMPTY
	}

	public static void main(String[] args) {
		//creating a chessboard matrix, array of size 8x8
		Chessmen[][] chessboard = new Chessmen[8][8]; 

		//nested for loop populate chessboard with pieces and empty spaces
		for (int i = 0; i<8; i++) {
			for (int j = 0; j<8; j++) {

				//if...else...to place pieces in their right place
				if ((i == 0) && ((j == 0)||(j == 7))) {
				chessboard[i][j] = Chessmen.BLACK_ROOK;
				}
				else if ((i == 0) && ((j == 1)||(j == 6))) {
				chessboard[i][j] = Chessmen.BLACK_KNIGHT;	
				}
				else if ((i == 0) && ((j == 2)||(j == 5))) {
				chessboard[i][j] = Chessmen.BLACK_BISHOP;	
				}
				else if ((i == 0) && (j == 3)) {
				chessboard[i][j] = Chessmen.BLACK_QUEEN;	
				}
				else if ((i == 0) && (j == 4)) {
				chessboard[i][j] = Chessmen.BLACK_KING;	
				}
				else if (i == 1) {
				chessboard[i][j] = Chessmen.BLACK_PAWN;	
				}

				else if ((i == 7) && ((j == 0)||(j == 7))) {
				chessboard[i][j] = Chessmen.WHITE_ROOK;
				}
				else if ((i == 7) && ((j == 1)||(j == 6))) {
				chessboard[i][j] = Chessmen.WHITE_KNIGHT;	
				}
				else if ((i == 7) && ((j == 2)||(j == 5))) {
				chessboard[i][j] = Chessmen.WHITE_BISHOP;	
				}
				else if ((i == 7) && (j == 3)) {
				chessboard[i][j] = Chessmen.WHITE_QUEEN;	
				}
				else if ((i == 7) && (j == 4)) {
				chessboard[i][j] = Chessmen.WHITE_KING;	
				}
				else if (i == 6) {
				chessboard[i][j] = Chessmen.WHITE_PAWN;	
				}

				else {
				chessboard[i][j] = Chessmen.EMPTY;	
				}


			}
		}

		//call printChess to print the chessboard
		printBoard(chessboard);

		//while loop print the chessboard and listen for user input
		//Scanner scanner = new Scanner(System.in);//create listener for user's instructions
		while(true){
			Scanner scanner = new Scanner(System.in);//create listener for user's instructions
			String ins = scanner.nextLine(); 

			//if enter "exit", this program will quit
			if (ins.equalsIgnoreCase("exit")) { //when comparing string, == won't work.
				scanner.close();
				break;
			}

			//if not "exit", then follow user's instruction
			else {
				move(chessboard, ins);							
			}			
			
		}			

	}

	public static void printBoard(Chessmen[][] chessboard){
		for (int i = 0; i<8; i++) {
			for (int j = 0; j<8; j++) {
				if ((0 == i)&&(0 == j)) {
					System.out.println("  \ta\tb\tc\td\te\tf\tg\th\t");
				}
				if (0 == j) {
					System.out.print(8 - i + ".\t");
				}
				switch(chessboard[i][j]){
					case BLACK_PAWN: System.out.print("\u265F\t");break;
					case BLACK_KING: System.out.print("\u265A\t");break;
					case BLACK_QUEEN: System.out.print("\u265B\t");break;
					case BLACK_BISHOP: System.out.print("\u265D\t");break;
					case BLACK_KNIGHT: System.out.print("\u265E\t");break;
					case BLACK_ROOK: System.out.print("\u265F\t");break;
					case WHITE_PAWN: System.out.print("\u2659\t");break;
					case WHITE_KING: System.out.print("\u2654\t");break;
					case WHITE_QUEEN: System.out.print("\u2655\t");break;
					case WHITE_BISHOP: System.out.print("\u2657\t");break;
					case WHITE_KNIGHT: System.out.print("\u2658\t");break;
					case WHITE_ROOK: System.out.print("\u2656\t");break;
					case EMPTY: System.out.print(" \t");break;
				}				
			}
			System.out.println(); //change to another line after each column
		}
	}

	//because used .next() instead of .nextLine(), bug occured
	public static void move(Chessmen[][] chessboard, String move){
		String[] components = move.split(" "); //parse move string into conponents, use of split?"" for one, " " for two, "   "for all.
		
		//first round input check, check about length	
		//length of String .length() length of array .length	
		if ((!(components[1].equalsIgnoreCase("to")))||(components[0].length() != 2)||(components[2].length() != 2)||(components.length != 3)) {
			System.err.println("Invalid input, try again!");
		}

		//if input length is okay, then move to the second round check
		else{
		//index for pieces, parse original place instruction to index number	
			int i, j;
			switch(components[0].charAt(0)){
				case 'a': j = 0; break;
				case 'b': j = 1; break;
				case 'c': j = 2; break;
				case 'd': j = 3; break;
				case 'e': j = 4; break;
				case 'f': j = 5; break;
				case 'g': j = 6; break;
				case 'h': j = 7; break;
				default : j = 8; break; //used for input validate			
		}
			switch(components[0].charAt(1)){
				case '8': i = 0; break;
				case '7': i = 1; break;
				case '6': i = 2; break;
				case '5': i = 3; break;
				case '4': i = 4; break;
				case '3': i = 5; break;
				case '2': i = 6; break;
				case '1': i = 7; break;
				default : i = 8; break; //used for input validate
		}

			//parse target place of instruction 
			int a, b;
			switch(components[2].charAt(0)){
				case 'a': b = 0; break;
				case 'b': b = 1; break;
				case 'c': b = 2; break;
				case 'd': b = 3; break;
				case 'e': b = 4; break;
				case 'f': b = 5; break;
				case 'g': b = 6; break;
				case 'h': b = 7; break;
				default : b = 8; break; //used for input validate
		}
			switch(components[2].charAt(1)){
				case '8': a = 0; break;
				case '7': a = 1; break;
				case '6': a = 2; break;
				case '5': a = 3; break;
				case '4': a = 4; break;
				case '3': a = 5; break;
				case '2': a = 6; break;
				case '1': a = 7; break;
				default : a = 8; break; //used for input validate
		}

			//check if input is valid, if not, ask for another input
			if ((8==i)||(8==j)||(8==a)||(8==b)) {
				System.err.println("Invalid input, try again!");
			}
		//if input is correct, then process to validate the move
			else {
				//call isValid to validate the move
				if (isValid(chessboard, i, j, a, b)) {
					Chessmen original = chessboard[i][j]; //store the original piece
					chessboard[i][j] = Chessmen.EMPTY; //clear original place	

						chessboard[a][b] = original; //move original piece to target place	

						printBoard(chessboard); //refresh the original chessboard
					//for (String[] a : components) //thought about for each once
				}
				else {
					System.err.println("Invalid Move!"); //way to print an error message.
				}
			}
		
		}
		
	}

	//return true if move is valid
	public static Boolean isValid(Chessmen[][] chessboard, int oldI, int OldJ, int newI, int newJ){
		//(TBC) Validate whether a move is valid
		return true;
	}
}

/*
Unicode for chess pieces:
\u2654 WK
\u2655 wQ
\u2656 wR
\u2657 wB
\u2658 wK
\u2659 wP

\u265A BK
\u265B bQ
\u265C bR
\u265D bB
\u265E bK
\u265F bP
*/
