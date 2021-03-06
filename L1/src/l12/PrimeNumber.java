package l12;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Input an integer");
		Scanner scanner = new Scanner(System.in); //it's not "System.in" but System.in, occurs exception
		String num = scanner.next();	
		scanner.close();

		if (isPrime(num)) {
			System.out.println("It is a prime number.");
		}
		else {
			System.out.println("It is not a prime number.");
		}

	}

	public static boolean isPrime(String num){
		double number = Double.parseDouble(num);
		int intNumber = 0;

		//check if input is integer
		if (number == (int)(number)) {
			intNumber = (int)number;
		}		
		else {
			intNumber = (int)Math.round(number);
			System.out.println(number + " is not an integer, rounded to " + intNumber);			
		}

		//no divisors except for 1 an
		boolean test = true;
		for (int i=2; i<intNumber; i++) {
			if ((intNumber%i) == 0) {
				test = false;				
			}						
		}
		if ( (intNumber==0) || (intNumber==1) ) {
			test = false;
		}
		return test;


			
	}

}
