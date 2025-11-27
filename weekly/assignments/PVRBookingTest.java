package weekly.assignments;

		import org.openqa.selenium.By;
		import org.openqa.selenium.chrome.ChromeDriver;
		import java.time.Duration;

		public class PVRBookingTest {

		    public static void main(String[] args) throws InterruptedException {

		        ChromeDriver driver = new ChromeDriver();         // launch Chrome
		        driver.manage().window().maximize();              // maximize window
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // implicit wait

		        driver.get("https://www.pvrcinemas.com/");        // load PVR website
		        Thread.sleep(3000);                               // wait for popup

		        driver.findElement(By.xpath("//button[text()='Chennai']")).click();   // select Chennai

		        driver.findElement(By.xpath("//span[text()='Quick Book']")).click();  // click Quick Book
		        driver.findElement(By.xpath("//span[text()='Cinema']")).click();      // click Cinema

		        driver.findElement(By.xpath("(//li[@class='pvr-dropdown-list'])[1]")).click(); // open cinema list
		        driver.findElement(By.xpath("//li[contains(text(),'PVR Heritage')]")).click(); // choose cinema

		        driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();   // select tomorrow

		        driver.findElement(By.xpath("//span[text()='Movie']")).click();      // select movie
		        driver.findElement(By.xpath("//li[contains(text(),'ANY MOVIE')]")).click(); // choose any movie

		        driver.findElement(By.xpath("//span[text()='Time']")).click();       // select show time
		        driver.findElement(By.xpath("(//li[@class='pvr-dropdown-list'])[3]")).click(); // pick first show

		        driver.findElement(By.xpath("//button[text()='Book']")).click();     // click Book
		        driver.findElement(By.id("tnc-check")).click();                      // accept T&C
		        driver.findElement(By.xpath("//button[text()='Proceed']")).click();  // click Proceed

		        driver.findElement(By.xpath("(//div[@class='seat'])[5]")).click();   // click available seat
		        driver.findElement(By.xpath("//button[text()='Proceed']")).click();  // click proceed again

		        String seatInfo = driver.findElement(By.xpath("//div[@class='seat-number']")).getText(); // seat info
		        System.out.println("Seat Selected: " + seatInfo);

		        String totalPrice = driver.findElement(By.xpath("//div[@class='net-amount']")).getText(); // grand total
		        System.out.println("Grand Total: " + totalPrice);

		        driver.findElement(By.xpath("//button[text()='Proceed']")).click();  // continue
		        driver.findElement(By.xpath("//button[text()='Close']")).click();    // close popup

		        System.out.println("Title: " + driver.getTitle());                  // print page title

		        driver.close();                                                      // close browser
		    }
		}

	
