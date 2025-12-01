package week4.day1;

public class Reporter {
	

	    // Overloaded method 1 - two arguments
	    public void reportStep(String msg, String status) {
	        System.out.println("Report: " + msg + " | Status: " + status);
	    }

	    // Overloaded method 2 - three arguments
	    public void reportStep(String msg, String status, boolean snap) {
	        System.out.println("Report: " + msg + " | Status: " + status + " | Take Snapshot: " + snap);
	    }

	    public static void main(String[] args) {

	        Reporter rep = new Reporter();

	        // Calling 2-argument method
	        rep.reportStep("Login successful", "PASS");

	        // Calling 3-argument method
	        rep.reportStep("Home page loaded", "PASS", true);
	    }
	}


