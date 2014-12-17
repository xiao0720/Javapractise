package tutorial1;

public class Loops {
	//print "Hello Worlds" for 5 times
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.print("Hello Worlds");
			System.out.println(" Message" + (i+1));
		} //for loop from 0 to 4
		for (int i = 9; i>=0; i--) {
			System.out.println("Counter i now is " + i);
		} //for loop from 9 to 0
		
		int i = 9;
		while(i >= 0){
			System.out.println("i in while loop now is " + i);
			i--;
		} //while loop from 9 to 0		
	}
}


