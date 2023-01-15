package Practice5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSugession {

	public static void main(String[] args) throws Exception {
           
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		WebElement srch=driver.findElement(By.xpath("//input[@title='Search']"));
		srch.sendKeys("mob");
		Thread.sleep(1000);
	    List<WebElement> sug = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	    //                                                   xpath of 10 elements of suggesssion text.
	    
	    System.out.println(sug.size());
	    for(int i=0;i<sug.size();i++)
	    {
	    	System.out.println(sug.get(i).getText());
	    }
	    for(int i=0;i<sug.size();i++)
	    {
	    	if(sug.get(i).getText().equals("mobikwik"))
	    	{
	    		sug.get(i).click();
	    		break;
	    	}
	    }
				
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
