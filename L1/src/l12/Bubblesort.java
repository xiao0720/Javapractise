package l12;

public class Bubblesort {

	public static void main(String[] args) {
		int[] A = new int[]{5,3,1,314,35,213,3};
		
		System.out.print("original array: ");
		//using loop to print an array
		for (int num: A) { //for each: for(dataTypeOfElement newName: existingArray)
			System.out.print(num + " ");
		}
		
		//using toString in Arrays to print an array
		//System.out.println(Arrays.toString(bubbleSort(A)));
		
		System.out.println();
		//using for each to print an array
		System.out.print("sorted array: ");
		for (int num: bubbleSort(A)) { 
			System.out.print(num + " "); //using " " to separate numbers
		}
		
		
	}

	public static int[] bubbleSort(int[] A){
		int ram = 0;	

		for (int i = 0; i<(A.length-1); i++) {
			for (int j=0; j<(A.length-1-i); j++) {
				if (A[j]>A[j+1]) {
				ram = A[j];
				A[j] = A[j+1];
				A[j+1] = ram;
				}
			}
		}

		return A;
	}

}
