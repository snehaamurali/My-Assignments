package week4.day1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTheLinks {
	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     List<WebElement> allElements = driver.findElements(By.tagName("a"));
	     int totalLinksCount = allElements.size();
	     System.out.println("The count: "+ totalLinksCount);
	     for (int i = 0; i <totalLinksCount; i++) {
	    	 String allText = allElements.get(i).getText();
	    	 System.out.println(allText);
	    	 //Stringalltext1 =allElements.get(0).getText();
	    	//Stringalltext2 =allElements.get(1).getText();
	    	//Stringalltext3 =allElements.get(2).getText();
	    	//Stringalltext43=allElements.get(42).getText();
		}
	     }
    
}
