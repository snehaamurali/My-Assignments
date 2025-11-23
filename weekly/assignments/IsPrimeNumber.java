package weekly.assignments;

public class IsPrimeNumber {
	
	    public static void main(String[] args) {

	        int input = 17;  // You can change this number and test
	        boolean isPrime = true;

	        // Prime number check starts here
	        for (int i = 2; i <= input - 1; i++) {
	            if (input % i == 0) {   // if divisible by any number
	                isPrime = false;    // not a prime
	                break;              // stop checking further
	            }
	        }

	        // Print result
	        if (isPrime) {
	            System.out.println(input + " is a Prime Number");
	        } else {
	            System.out.println(input + " is NOT a Prime Number");
	        }
	    }
	}

}
