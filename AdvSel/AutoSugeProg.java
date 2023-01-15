package AdvSel;

import java.util.List;
//handle autosugession 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSugeProg {
     // handle autosugesssion in selenium
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("aks");
		Thread.sleep(2000);
         List<WebElement> autosugEle = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
         
         for(int i=0;i<autosugEle.size();i++)
         {
        	 System.out.println(autosugEle.get(i).getText());
         }
         for(int i=0;i<autosugEle.size();i++)
         {
        	 if(autosugEle.get(i).getText().equals("akshara"))
        	 {
        		 autosugEle.get(i).click();
        		 break;
        		 
        	 }
         }
         
         Thread.sleep(5000);
         driver.close();
	}

}
