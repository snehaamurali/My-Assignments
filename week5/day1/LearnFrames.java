package week5.day1;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	public static void main(String[] args) {
	// Launch the Browser
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.leafground.com/frame.xhtml");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//Switch the focus
			driver.switchTo().frame(0);
			driver.findElement(By.id("Click")).click();
}
}