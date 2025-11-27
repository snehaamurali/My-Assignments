package weekly.assignments;

public class PalindromeNumber {



	    public static void main(String[] args) {

	        // Step 1: Declare variables
	        int input = 121;     // you can change this value and test
	        int output = 0;      // to store reversed number
	        int rem = 0;         // to store remainder

	        // Step 2: Reverse the number using for loop
	        for (int i = input; i > 0; i = i / 10) {
	            rem = i % 10;                // get the last digit
	            output = (output * 10) + rem; // build reversed number
	        }

	        // Step 3: Compare input and output
	        if (input == output) {
	            System.out.println(input + " is a Palindrome");
	        } else {
	            System.out.println(input + " is NOT a Palindrome");
	        }
	    }
	}


