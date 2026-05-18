import java.util.Arrays;

//Define the functional interface with SAM 'Nth'
interface NthBiggest {
	public int Nth(int[] tmp, int x);
}

public class NthLargest {

	public static void main(String[] args) {

		// Initialized the Array numbers
		int[] numArray = { 34, 21, 45, 75, 62, 98, 13, 49 };
		System.out.println("The given array numbers are here");
		System.out.print("[");

		// Print the Array elements to the console
		dispArray(numArray);

		/* Define the Lambda expression for the functional interface 'NthBiggest' */
		NthBiggest Nb = ((numArr, pos) -> {
			Arrays.sort(numArr);
			return numArr[numArr.length - pos];
		});
		System.out.println("NthLargest number in the Array is=" + Nb.Nth(numArray, 2));
	}

	// The dispArray function with the argument Array
	private static void dispArray(int[] numArray) {
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(numArray[i] + " ");
		}
		System.out.println("]");
	}
}