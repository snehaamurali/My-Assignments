package weekly.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags for boys");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='sac-suggestion-row-1']")).click();
		String totalResults = driver.findElement(By.xpath("//span[text()='1-48 of over 40,000 results for']"))
				.getText();
		System.out.println("Total Results: " + totalResults);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Skybags']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Frantic']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='New Arrivals']")).click(); // apply sorting → New Arrivals
		Thread.sleep(2000); // wait for sorting

		String firstBagName = driver
				.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).getText(); 

		String firstBagPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText(); 

		System.out.println("First Bag Name: " + firstBagName); // print bag name
		System.out.println("Discounted Price: " + firstBagPrice); // print price

		System.out.println("Page Title: " + driver.getTitle()); // print page title
		driver.close(); // close browser
	}
}
