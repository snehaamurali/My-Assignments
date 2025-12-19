package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
public static void main(String[] args) {
	// Launch the Browser
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.irctc.co.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//button[text()='OK']")).click();
			driver.findElement(By.xpath("//label[text()='FLIGHTS']")).click();
			//Address of new opened window
			//Retrieves all window IDs
			Set<String> windowHandles = driver.getWindowHandles();	
			System.out.println("The set is" +windowHandles);
			//To index windows
			List<String> allAddress=new ArrayList<String>(windowHandles);
			String address = allAddress.get(1);//2nd window
			String titleBeforeSwitching = driver.getTitle();
			System.out.println(titleBeforeSwitching);
			driver.switchTo().window(address);
			String titleAfterSwitching = driver.getTitle();
			System.out.println(titleAfterSwitching);
			driver.close();
		}
			
	}

