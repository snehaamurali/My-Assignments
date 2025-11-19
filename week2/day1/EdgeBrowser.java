package week2.day1;

public class EdgeBrowser {
	public static void main(String[] args) {      

        Browser obj = new Browser();              // Create object for Browser class

        obj.launchBrowser("Edge");                // Call the same methods from Browser class
        String output = obj.loadUrl();            // Store the returned String
        System.out.println(output);               // Print the result
    }
}
