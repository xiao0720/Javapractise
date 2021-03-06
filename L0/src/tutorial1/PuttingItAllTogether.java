package tutorial1;

import java.util.Scanner;

public class PuttingItAllTogether {

	public static void main(String[] args) {
		//To-Do: ask name and age, age less then 15, print as many times as the age, or print once and do the reverse
		System.out.println("Input your name and age please:");
		Scanner scanner = new Scanner(System.in);

		String name = scanner.next();
		//int age = scanner.nextInt(); //Integer.parseInt(String age) can be used if age is from .next()
		String age = scanner .next(); 
		scanner.close();

		if (Integer.parseInt(age) < 15){ //from String to Integer using parse, from Integer to String using .toString()
			for (int i = Integer.parseInt(age); i>0 ; i--) {
				System.out.println(name);
			}
		}
		else {
			String reverseName = new StringBuilder(name).reverse().toString(); //reverse a string using a method from StringBuilder
			System.out.println(reverseName);
		}
	}
	
	/*
	 * Difference between stringbuilder and stringbuffer: (Wikied)
	 * 		StringBuffer is synchronized, StringBuilder is not. 
	 * 		So StringBuilder is faster than StringBuffer because it's not synchronized.
	 * 		The operations are "almost" the same, but using synchronized methods in a single thread is overkill.
	 */

}
