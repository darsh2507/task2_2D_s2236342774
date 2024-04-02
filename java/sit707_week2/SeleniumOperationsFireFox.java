package sit707_week2;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;





public class SeleniumOperationsFireFox {
	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	

	public static void officeworks_registration_page(String url) throws IOException {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up Firefox browser.");
		WebDriver driver = new FirefoxDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Darsh");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		WebElement lname = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + lname);
		// Send first name
		lname.sendKeys("Patel");
		
		WebElement number = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element: " + number);
		// Send first name
		number.sendKeys("0413895113");
		
		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Found element: " + number);
		// Send first name
		email.sendKeys("darshp958@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		System.out.println("Found element: " + number);
		// Send first name
		password.sendKeys("Darsh@123");
		
		WebElement cpassword = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found element: " + cpassword);
		// Send first name
		cpassword.sendKeys("Darsh123");
		
		
		
		
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		WebElement createAccountButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[12]/button"));

		// click the button
		createAccountButton.click();
		/*
		 * Take screenshot using selenium API.
		 */
		
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Step 4: Save the screenshot
       Files.copy(screenshotFile, new File("D:\\Software Testing\\picture\\officefirefox.jpg"));

		
		// Sleep a while
		sleep(35);
		
		// close chrome driver
		driver.close();	
	}

}
