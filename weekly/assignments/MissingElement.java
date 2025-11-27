package weekly.assignments;


	import java.util.Arrays;

	public class MissingElement {
	    public static void main(String[] args) {

	        // Input array
	        int[] arr = {1, 4, 3, 2, 8, 6, 7};

	        // Step 1: Sort the array
	        Arrays.sort(arr);

	        // Step 2: Loop through expected sequence
	        for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {

	            // Compare expected value (i) with actual array value
	            if (i != arr[i - arr[0]]) {
	                System.out.println("Missing number: " + i);
	                break; // Stop after finding the first missing number
	            }
	        }
	    }
	}

}
