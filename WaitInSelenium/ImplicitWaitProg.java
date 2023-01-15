package WaitInSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitProg {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implecite wait are applicable for every elements.
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("akshay");
	    List<WebElement> sugess = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	    for(int i=0 ;i<sugess.size();i++)
	    {
	    	System.out.println(sugess.get(i).getText());
	    }
driver.close();
	}

}
