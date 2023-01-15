package ActionclassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDPro {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		WebElement dayDropDown =driver.findElement(By.xpath("//select[@id='date_day']"));
		WebElement monthDropDown = driver.findElement(By.xpath("//select[@id='date_mon']"));
		WebElement yearDropDown = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		 Actions z = new Actions(driver);
		 z.moveToElement(dayDropDown).click().build().perform();
		 for(int i=0;i<16;i++)
		 {
			 Thread.sleep(500);
			 z.sendKeys(Keys.DOWN).build().perform();
		 }
		 z.sendKeys(Keys.ENTER).build().perform();
		 Thread.sleep(1000);
	//	 Actions b = new Actions(driver);

         z.moveToElement(monthDropDown).click().build().perform();
         for(int i=0;i<5;i++)
         {
			 Thread.sleep(500);
             z.sendKeys(Keys.DOWN).build().perform();
         }
         z.sendKeys(Keys.ENTER).build().perform();
        yearDropDown.sendKeys("1998");
		 Thread.sleep(5000);

		driver.close();
		
		

	}

}
