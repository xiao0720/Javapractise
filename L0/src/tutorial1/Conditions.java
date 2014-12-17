package tutorial1;

import java.util.Scanner; //auto import using Organise Imports

public class Conditions {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please input your name.");
		String name = scanner.nextLine();
		scanner.close(); //close scanner after use.
		
		if (name.isEmpty()){
			System.out.println("Name is empty.");
		}
		else if(name.length() < 2){
			System.out.println("Length of name is less than 2 characters.");
		}
		else {
			System.out.println("Nice to meet you " + name + "!");
		}

	}

}
	