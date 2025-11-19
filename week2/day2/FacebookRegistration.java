package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;   // ✅ Correct Duration class

public class FacebookRegistration {

    public static void main(String[] args) throws InterruptedException {

        // 1. Launch ChromeDriver
        WebDriver driver = new ChromeDriver();

        // 2. Load the Facebook UK URL
        driver.get("https://en-gb.facebook.com/");

        // 3. Maximize the browser window
        driver.manage().window().maximize();

        // 4. Apply implicit wait for elements to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 5. Click on 'Create new account'
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();

        // Slight wait to allow modal to load
        Thread.sleep(2000);

        // 6. Enter First Name
        driver.findElement(By.name("firstname")).sendKeys("Snehaa");

        // 7. Enter Surname
        driver.findElement(By.name("lastname")).sendKeys("Arumugam");

        // 8. Enter Mobile or Email
        driver.findElement(By.name("reg_email__")).sendKeys("snehaa.test@example.com");

        // 9. Enter New Password
        driver.findElement(By.name("reg_passwd__")).sendKeys("Test@12345");

        // 10. Handle Date of Birth dropdown - Day
        WebElement dayDropdown = driver.findElement(By.id("day"));
        Select day = new Select(dayDropdown);
        day.selectByVisibleText("10");

        // 11. Month dropdown
        WebElement monthDropdown = driver.findElement(By.id("month"));
        Select month = new Select(monthDropdown);
        month.selectByVisibleText("May");

        // 12. Year dropdown
        WebElement yearDropdown = driver.findElement(By.id("year"));
        Select year = new Select(yearDropdown);
        year.selectByVisibleText("1995");

        // 13. Select Gender radio button
        WebElement genderFemale = driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input"));
        genderFemale.click();

        // 14. Close browser after a few seconds
        Thread.sleep(3000);
        driver.quit();
    }
}
