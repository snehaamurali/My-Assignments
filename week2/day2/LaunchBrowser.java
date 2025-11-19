package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("https://www.facebook.com/");
		//maximize the window
		driver.manage().window().maximize();
		//close the window
//		driver.close();
		driver.findElement(By.name("email")).sendKeys("snehaa");
		driver.findElement(by.)
	}

}
