package sit707_week2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SeleniumOperations1 {
	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void pwc_registration_page(String url) throws IOException {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
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
		WebElement element = driver.findElement(By.id("FirstName"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Darsh");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		
		WebElement element1 = driver.findElement(By.id("LastName"));
		System.out.println("Found element: " + element1);
		// Send first name
		element1.sendKeys("Patel");
		

		WebElement email = driver.findElement(By.id("Email"));
		System.out.println("Found element: " + email);
	
		email.sendKeys("darshp958@gmail.com");
	
		
		WebElement password = driver.findElement(By.id("registerPassword"));
		System.out.println("Found element: " + password);
		password.sendKeys("Darsh@123");
		
		WebElement cpassword = driver.findElement(By.id("ConfirmPassword"));
		System.out.println("Found element: " + cpassword);
		cpassword.sendKeys("Darsh123");
		
		
		
		
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		WebElement createAccountButton = driver.findElement(By.xpath("//*[@id=\"register-form\"]/div[9]/button"));

		// click the button
		createAccountButton.click();
//		/*
//		 * Take screenshot using selenium API.
//		 */
//		
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Step 4: Save the screenshot
       Files.copy(screenshotFile, new File("D:\\Software Testing\\picture\\pwc.jpg"));

		
		// Sleep a while
		sleep(35);
		
		// close chrome driver
		driver.close();	
	}
	
}
