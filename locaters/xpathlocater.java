package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocater 
{

	public static void main(String[] args)
	
	{
       System.setProperty("webdriver.chrome.driver","D:\\Web Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		

		// relative xpath
		//driver.findElement(By.xpath("//input[@placeholder = 'Search']")).sendKeys("Tshirt");
		//driver.findElement(By.xpath("//button[@name = 'submit_search']")).click();
		
		//xpath with contains()
		//driver.findElement(By.xpath("//input[contains(@id , 'search_')]")).sendKeys("T-Shirt");
		//driver.findElement(By.xpath("//button[contains(@name, 'submit_')]")).click();
		
		//X path With Text()
		//driver.findElement(By.xpath("//a[text()='Women']")).click();
		
		// chained xpath ...> parent child relation
		driver.findElement(By.xpath("//form[@id = 'searchbox']//input[4]")).sendKeys("T-Shirt");
		driver.findElement(By.xpath("//form[@id = 'searchbox']//button[1]")).click();
		
		
		
		
		driver.quit();
		
	}

}
