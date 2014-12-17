package tutorial2;

import java.util.Scanner;

public class Methods {
	//static double results = 0.0d; //static reference needed made to a static field, no need here
	public static void main(String[] args) {
		System.out.println("Simple calculator. Please choose an operation:\n1. Add\n2. Substract\n3. Multiply\n4. Divide\n5. Factorial\n6. Exit");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double results = 0.0d;//just keep an eye on the scope, nice try
		if (n < 5 && n > 0) {
			System.out.println("Input a and b please:");
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			scanner.close();
			switch (n) {
				case 1: results = (double)add(a,b); break;
				case 2: results = (double)substract(a,b); break;
				case 3: results = (double)multiply(a,b); break;
				case 4: results = (double)devide(a,b); break;
				default: System.out.println("Error.");
			}
		}
		else if (n == 5) {
			System.out.println("Input a please:");
			int a = scanner.nextInt();
			results = (double)factorial(a);
		}
		else{
			System.out.println("See you!");
			System.exit(0);
		}

		System.out.println("The result is: " + results);		
	}

	public static int add(int a, int b){
	//public - access everywhere in the system
	//static - class method, no need to create an instance to use the method
		int result = a + b;
		return result;
	}

	public static int substract(int a, int b){
		int result = a - b;
		return result;
	}

	public static int multiply(int a, int b){
		int result = a * b;
		return result;
	}

	public static int devide(int a, int b){
		int result = a / b;
		return result;
	}

	public static int factorial(int a){
	//do factorial calculation by using recursion
        int fact = 1; // this  will be the result
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }	
}


