package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		
		// Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//Address of new opened window
		Set<String> windowHandles = driver.getWindowHandles();	
		System.out.println("The set is" +windowHandles);
		
		//Convert Set to List
		List<String> allAddress=new ArrayList<String>(windowHandles);
		
		//Point to 2nd window
		String address = allAddress.get(1);//2nd window
		
		//Print the Title of 1st window
		String titleBeforeSwitching = driver.getTitle();
		System.out.println(titleBeforeSwitching);
		
		//Switch to 2nd window
		driver.switchTo().window(address);
		
		//Print the Title of 1st window
		String titleAfterSwitching = driver.getTitle();
		System.out.println(titleAfterSwitching);
		driver.close();
	}

}
