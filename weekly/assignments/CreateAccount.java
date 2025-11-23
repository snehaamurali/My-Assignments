package weekly.assignments;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class CreateAccount {

	    public static void main(String[] args) throws InterruptedException {

	        // 1. Launch Chrome
	        ChromeDriver driver = new ChromeDriver();

	        // 2. Load the URL
	        driver.get("http://leaftaps.com/opentaps/");

	        // 3. Maximize window
	        driver.manage().window().maximize();

	        // 4. Enter Username
	        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

	        // 5. Enter Password
	        driver.findElement(By.id("password")).sendKeys("crmsfa");

	        // 6. Click Login button
	        driver.findElement(By.className("decorativeSubmit")).click();

	        // 7. Click CRM/SFA
	        driver.findElement(By.linkText("CRM/SFA")).click();

	        // 8. Click Accounts Tab
	        driver.findElement(By.linkText("Accounts")).click();

	        // 9. Click Create Account
	        driver.findElement(By.linkText("Create Account")).click();

	        // 10. Enter Account Name
	        driver.findElement(By.id("accountName")).sendKeys("SnehaaTestAccount");

	        // 11. Enter Description
	        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

	        // 12. Select Industry: ComputerSoftware
	        WebElement industry = driver.findElement(By.name("industryEnumId"));
	        Select dd1 = new Select(industry);
	        dd1.selectByVisibleText("Computer Software");

	        // 13. Select Ownership: S-Corporation (by VisibleText)
	        WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
	        Select dd2 = new Select(ownership);
	        dd2.selectByVisibleText("S-Corporation");

	        // 14. Select Source: Employee (by Value)
	        WebElement source = driver.findElement(By.id("dataSourceId"));
	        Select dd3 = new Select(source);
	        dd3.selectByValue("LEAD_EMPLOYEE");

	        // 15. Select Marketing Campaign: eCommerce Site Internal Campaign (by Index)
	        WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
	        Select dd4 = new Select(marketing);
	        dd4.selectByIndex(6); // based on dropdown index

	        // 16. Select State/Province: Texas (by Value)
	        WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
	        Select dd5 = new Select(state);
	        dd5.selectByValue("TX");

	        // 17. Click Create Account Button
	        driver.findElement(By.className("smallSubmit")).click();

	        // 18. Verify Account Name
	        String accName = driver.findElement(By.id("accountName")).getText();
	        System.out.println("Account Created: " + accName);

	        // 19. Close Browser
	        driver.close();
	    }
	}


