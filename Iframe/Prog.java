package Iframe;
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 	
import org.openqa.selenium.chrome.ChromeDriver; 
public class Prog {

	public static void main(String[] args) throws Exception {
		 
		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst"); 
		driver.manage().window().maximize(); 
		driver.switchTo().frame("iframeResult"); 
		 
		WebElement timeDisplayButoton = driver.findElement(By.xpath("//button[@type='button']")); 
		timeDisplayButoton.click(); 
		Thread.sleep(5000); 
		driver.switchTo().parentFrame(); 
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//a[@id='tryhome']")).click(); 
		 
		driver.close();
	}

}
