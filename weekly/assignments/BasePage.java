
	package weekly.assignments;

	// Superclass
	class BasePage {

	    public void findElement() {
	        System.out.println("Finding element using generic locator...");
	    }

	    public void clickElement() {
	        System.out.println("Clicking element using default click method...");
	    }

	    public void enterText() {
	        System.out.println("Entering text in a generic text field...");
	    }

	    public void performCommonTasks() {
	        System.out.println("Performing common tasks for any page...");
	    }
	}

	// Subclass
	class LoginPage extends BasePage {

	    @Override
	    public void performCommonTasks() {
	        System.out.println("Performing specific login tasks...");
	        System.out.println("- Locate username field");
	        System.out.println("- Locate password field");
	        System.out.println("- Click login button");
	    }
	}

	// Test class to run both
	public class TestPage {

	    public static void main(String[] args) {

	        // Parent class object
	        BasePage base = new BasePage();
	        System.out.println("---- BasePage Output ----");
	        base.performCommonTasks();

	        // Child class object
	        LoginPage login = new LoginPage();
	        System.out.println("\n---- LoginPage Output ----");
	        login.performCommonTasks();

	        // Calling inherited methods
	        System.out.println("\n---- LoginPage Using Inherited Methods ----");
	        login.findElement();
	        login.clickElement();
	        login.enterText();
	    }
	}


