package tutorial2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ByteConversion {

	public static void main(String[] args) {
	final String[] UNITS = {"B", "KB", "MB", "GB"}; //final is unable to change once initialized 
	System.out.println("Input the number in bytes");
	Scanner scanner = new Scanner(System.in);
	double number = scanner.nextDouble();
	scanner.close();

	double[] result = new double[4];
	int i = 0;
	for (i = 0; i<4; i++) {
		if (i==0) {
			result[i] = number;
			if ((result[i]/1024)<1) {
				break;
			}
		}
		else {
			result[i] = result[i-1]/1024;
			if ((result[i]/1024)<1) {
				break;
			}
		}		
	}
	DecimalFormat df = new DecimalFormat("#.#");
	System.out.println("The result is: " + df.format(result[i]) + " " + UNITS[i]);
	//.format() in DecimalFormat class used to formatting result
	}

}
