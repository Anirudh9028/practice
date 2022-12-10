package locaters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class basicOne {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Web Driver\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.name("q")); // find web element using............> Attribute(name) + value("q")
		searchBox.sendKeys("T shirt");// pass text using.....>.sendKeys("Text") method
		
		driver.findElement(By.linkText("Become a Seller")); // find web element using............> LinkText ("linktext present in HTML code ")
		
		/*Find How many Sliding WebImage Present On a Web Page....?
		 * ....> For that we use findElements method.... it will use where we need to find multiple elements at time
		 * ....> For that we need to choose common Attribute In HTML code...Here it is class name is common. 
		 * .....> .size() method... return count of element */
		
		//Using classname
		
		int sliderCount = driver.findElements(By.className("_1mIbUg")).size(); // find web element using............> Attribute(classname) + value("_1mIbUg")
		System.out.println("Slider Count is: "+ sliderCount);
		
		/*Find How Many Links Are Present In Web Page .....?
		 * ....> For that we use findElements method.... it will use where we need to find multiple elements at time
		 * ....> For that we need to choose common Attribute In HTML code...in html code for the links they are  mostly tag name as 'a'
		 * so here we use tag name as common attribute
		 * .....> .size() method... return count of element*/
		
		// Using Tag Name
		
		int linkcount = driver.findElements(By.tagName("a")).size();
		System.out.println("All links Present on Web page Count is: "+ linkcount);
		
		
		
		
		
		
		driver.quit();
		
	}

}
