package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorLocatores 
{
	/* Cascading Stylish Sheet cssSelectores */

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver","D:\\Web Driver\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		/* tag + id(value) */
		//driver.findElement(By.cssSelector("input#email")).sendKeys("david");
		//OR
		//driver.findElement(By.cssSelector("#email")).sendKeys("david");
		
	    /* tag + class(value) */
		//driver.findElement(By.cssSelector("input.inputtext ")).sendKeys("david");
		//OR
    	//driver.findElement(By.cssSelector(".inputtext ")).sendKeys("david");
		
		/* tag + attribute*/
		//driver.findElement(By.cssSelector("input[data-testid = royal_email]")).sendKeys("david");
		//OR
		//driver.findElement(By.cssSelector("[data-testid = royal_email]")).sendKeys("david");
		
		/* tag + class + attribute */
		driver.findElement(By.cssSelector("input.inputtext[data-testid = royal_email]")).sendKeys("david");
		
		
		driver.quit();

	}
	
}
