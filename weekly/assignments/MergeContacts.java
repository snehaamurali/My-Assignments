package weekly.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContacts {

    public static void main(String[] args) {

        // 1. Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // 2. Maximize window
        driver.manage().window().maximize();

        // 3. Add implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 4. Load the URL
        driver.get("http://leaftaps.com/opentaps/control/login");

        // 5. Enter username
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");

        // 6. Enter password
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        // 7. Click Login button
        driver.findElement(By.className("decorativeSubmit")).click();

        // 8. Click CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // 9. Click Contacts button
        driver.findElement(By.linkText("Contacts")).click();

        // 10. Click Merge Contacts
        driver.findElement(By.linkText("Merge Contacts")).click();

        // ------------------------------
        // WINDOW HANDLING STARTS HERE
        // ------------------------------

        // 11. Click widget of "From Contact"
        driver.findElement(By.xpath("//img[@alt='Lookup']")).click();

        // 12. Switch to newly opened window
        Set<String> windowHandles1 = driver.getWindowHandles();
        List<String> windowList1 = new ArrayList<>(windowHandles1);
        driver.switchTo().window(windowList1.get(1));

        // 13. Click on FIRST resulting contact
        driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();

        // 14. Switch back to main window
        driver.switchTo().window(windowList1.get(0));

        // --------------------------------------------------
        // SECOND contact selection: "To Contact" widget
        // --------------------------------------------------

        // 15. Click widget of "To Contact"
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

        // 16. Switch to new window again
        Set<String> windowHandles2 = driver.getWindowHandles();
        List<String> windowList2 = new ArrayList<>(windowHandles2);
        driver.switchTo().window(windowList2.get(1));

        // 17. Click on SECOND resulting contact
        driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[2]")).click();

        // 18. Switch back to main window
        driver.switchTo().window(windowList2.get(0));

        // ------------------------------
        // MERGE + ALERT
        // ------------------------------

        // 19. Click Merge button
        driver.findElement(By.linkText("Merge")).click();

        // 20. Accept the alert
        driver.switchTo().alert().accept();

        // ------------------------------
        // VERIFY PAGE TITLE
        // ------------------------------

        String title = driver.getTitle();
        System.out.println("Page Title After Merge: " + title);

        if (title.contains("View Contact")) {
            System.out.println("✔ Title Verified Successfully");
        } else {
            System.out.println("❌ Title Verification Failed");
        }

        // 21. Close browser
        driver.quit();
    }
}
