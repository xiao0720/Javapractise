import java.util.Scanner;


public class ProgramFlowandBooleans {

	public static void main(String[] args) {
		System.out.println("Input a number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(isEven(num));
		scanner.close();

	}

/* original version
	public static boolean isEven(int number){
		if (number % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

*/

/* use local variable, single return
	public static boolean isEven(int number){
		boolean isEven;
		if (number % 2 == 0) {
			isEven = true;
		}
		else {
			isEven = false;
		}
		return isEven;
	}
*/

/* use (statement) ? true : false
	public static boolean isEven(int number){
		boolean isEven = (number % 2 == 0) ? true : false; //if (statement) true, =true, else flase
		return isEven;
	}
*/

	//most simple one, without local variable
	public static boolean isEven(int number){
		return (number % 2 == 0) ? true : false;
	}

}
