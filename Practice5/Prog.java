package Practice5;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

abstract public class Prog {
	
	public abstract void Screenshot() throws Exception;
	public  void ListBox() throws Exception
	{
		
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://is.rediff.com/signup/register");
			WebElement list = driver.findElement(By.xpath("//select[ @id='date_day']"));
			 Select s1 = new Select(list);
			 s1.selectByVisibleText("16");
			 Thread.sleep(2000);
			 driver.close();
			 
			 
	}
	
	

}
