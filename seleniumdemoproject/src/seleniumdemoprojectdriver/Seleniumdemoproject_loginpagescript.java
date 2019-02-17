
 
package seleniumdemoprojectdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumdemoproject_loginpagescript {

	public static void main(String[] args) {
		
	// step 1 open chrome browser
		String key ="webdriver.chrome.driver";
		String Bropath="D:\\selenium\\java selenium\\drivers\\chromedriver.exe";
		String appurl="https://www.facebook.com";
		
		System.setProperty(key,Bropath);
		
		WebDriver driver = new ChromeDriver();
		
		// step 2 Enter facebook url
		driver.get(appurl);
		
		// step 3 Enter user name
		driver.findElement(By.id("email")).sendKeys("welcomeselenium");
	
		// step 4 Enter the password
		driver.findElement(By.name("pass")).sendKeys("test");
		
		// step 5 Click the login button
		driver.findElement(By.id("u_0_8")).click();
		
		//  step Close the browser
		

		
	}

}

