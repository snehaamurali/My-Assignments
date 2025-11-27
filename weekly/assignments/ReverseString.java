package weekly.assignments;

public class ReverseString {
    public static void main(String[] args) {

        String companyName = "TestLeaf";

        // Convert string to character array
        char[] charArray = companyName.toCharArray();

        System.out.println("Reversed String:");

        // Loop from last index to first index
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
   
	}

}
