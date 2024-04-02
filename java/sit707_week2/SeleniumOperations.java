package sit707_week2;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import com.google.common.io.Files;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		
		
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
	
		driver.get(url);


       
		 WebElement emailInput = driver.findElement(RelativeLocator.with(By.tagName("input")).above(driver.findElement(By.id("lastname"))));

	      
	        emailInput.sendKeys("Darsh");

	        WebElement lname = driver.findElement(RelativeLocator.with(By.tagName("input")).above(driver.findElement(By.id("phoneNumber"))));

	     
	        lname.sendKeys("Patel");
	        WebElement email = driver.findElement(RelativeLocator.with(By.tagName("input")).above(driver.findElement(By.id("email"))));

	      
	        email.sendKeys("0413895113");
        
	        WebElement pass = driver.findElement(RelativeLocator.with(By.tagName("input")).above(driver.findElement(By.id("confirmPassword"))));

	       
	        pass.sendKeys("Darsh@123");
	        WebElement pass1 = driver.findElement(RelativeLocator.with(By.tagName("input")).below(driver.findElement(By.id("password"))));

	      
	        pass1.sendKeys("Darsh@2507");
        
	        WebElement submit = driver.findElement(RelativeLocator.with(By.tagName("input")).above(driver.findElement(By.id("confirmPassword"))));
	        submit.click();
		
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Step 4: Save the screenshot
       Files.copy(screenshotFile, new File("D:\\Software Testing\\picture\\officeRelativenew.jpg"));

		
		// Sleep a while
		sleep(5);
		
		// close chrome driver
		driver.close();	
	}



	
	
}
