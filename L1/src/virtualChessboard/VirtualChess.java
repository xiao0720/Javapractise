package virtualChessboard;

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
				else if ((i == 0) && (j == 3)) {
				chessboard[i][j] = Chessmen.BLACK_KING;	
				}
				else if (i == 1) {
				chessboard[i][j] = Chessmen.BLACK_PAWN;	
				}

				if ((i == 7) && ((j == 0)||(j == 7))) {
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
				else if ((i == 7) && (j == 3)) {
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

	}
	public static void printBoard(Chessmen[][] chessboard){
		
	}
}