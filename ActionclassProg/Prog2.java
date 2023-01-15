package ActionclassProg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chrome.driver", "ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightClickBtn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		WebElement doubleClickBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		
		Actions a = new Actions(driver);
		  a.moveToElement(rightClickBtn).contextClick().build().perform();
		  Thread.sleep(2000);
		  a.sendKeys(Keys.ARROW_DOWN).build().perform(); 
			Thread.sleep(2000);

		  a.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(2000);

		  a.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(2000);
           a.sendKeys(Keys.ENTER).build().perform();
           Thread.sleep(2000);
           Alert x = driver.switchTo().alert();
           x.accept();
           Thread.sleep(2000);
           Actions b = new Actions(driver);
           
           b.doubleClick(doubleClickBtn).build().perform();
           Thread.sleep(2000);
           Alert z = driver.switchTo().alert();
           z.accept();
           Thread.sleep(2000);
           driver.close();
		
	}

}
