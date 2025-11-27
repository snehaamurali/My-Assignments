package weekly.assignments;

public class ChangeOdd {

  // package name in lowercase

	   // class name in PascalCase

	    public static void main(String[] args) {   // main method begins
	        String input = "changeme";   // input string
	        char[] characters = input.toCharArray();   // convert to char array

	        for (int i = 0; i < characters.length; i++) {   // loop through characters
	            if (i % 2 != 0) {   // check if index is odd
	                characters[i] = Character.toUpperCase(characters[i]);   // convert to uppercase
	            }
	        }

	        System.out.println(new String(characters));   // print final result
	    }
	}


	
