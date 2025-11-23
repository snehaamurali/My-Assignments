package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		//String Literal
		String name="Snehaa";
		String str1="Testleaf";
		//String Instantiation
		String str2=new String("Testleaf");
		String str3="Testleaf";
		String str4=new String("Testleaf");
	    // ==  reference address
		// 	.equals values of 2 strings
		System.out.println(str1==str3);
		System.out.println(str1==str2);
		System.out.println(str2==str4);
		
		System.out.println(str1.equals(str2));
		
		String batchName="Sel Nov";
		//Find the length of String- count the number of characters.
		int lengthOfString = batchName.length();
		System.out.println("Length of String"  +" " +lengthOfString); 
		boolean contains = batchName.contains("Nov");
		System.out.println(batchName.contains("Nov"));
	    //Ignore the case
		System.out.println(batchName.equalsIgnoreCase("SEl NOv"));
		//String into Upper case
		//Input-Sel Nov
		//Output-SEL NOV
		String upperCase = batchName.toUpperCase();
		System.out.println(upperCase);
		//Lowercase
		String lowerCase = batchName.toLowerCase();
		System.out.println(lowerCase);
		//String to Char Array
		String batch="Selenium";
		//int num[]= {1,2,3};
		//char characters[]= {'t','e','s','t'}; 	
		//
		char[] charArray = batch.toCharArray();
		System.out.println(charArray[0]);
	}

	
}
