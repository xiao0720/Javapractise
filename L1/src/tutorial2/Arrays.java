package tutorial2;

public class Arrays {

	public static void main(String[] args) {
		int[] numbers = new int[20];
		numbers[0] = 1;
		System.out.println("numbers[0] is " + numbers[0]);
		for (int i = 1; i < numbers.length ; i++) {//int[] .length to use length not length()
			numbers[i] = numbers[i-1]*2;
			System.out.println("numbers[" + i + "] is: " + numbers[i]);
		}
		int[] mean = new int[21];
		mean[0] = numbers[0];
		System.out.println("mean[0] is " + mean[0]);
		
		for (int i = 1; i<numbers.length; i++) {
			mean[i] = (numbers[i-1] + numbers[i])/2;
			System.out.println("mean[" + i + "] is: " + mean[i]);
		}
		mean[20] = numbers[19];
		System.out.println("mean[20] is " + mean[20]);
	}
	//there was a bug, think of throw exception
}
