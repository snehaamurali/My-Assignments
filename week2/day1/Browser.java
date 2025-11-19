package week2.day1;

public class Browser {
    
public void launchBrowser(String browserName) {               // Method 1: Takes one input (browserName)
System.out.println(browserName + " browser launched");    // Prints which browser is launched
}

public String loadUrl() {                                     // Method 2: Returns a message (String)
return "URL loaded successfully";                         // Returns a String value to the caller
}

public static void main(String[] args) {                      // Main method – program starts here
Browser obj = new Browser();                              // Create object for Browser class

obj.launchBrowser("Chrome");                              // Call method launchBrowser() using object
String result = obj.loadUrl();                            // Call method loadUrl() and store returned value
System.out.println(result);                               // Print the returned message on screen
}
}