package ListProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleListProg {

	public static void main(String[] args) {
               WebDriverManager.chromedriver().setup();
               WebDriver driver = new ChromeDriver();
               driver.manage().window().maximize();
               driver.get("https://is.rediff.com/signup/register");
                 
                      List<WebElement> yearlist = driver.findElements(By.xpath("//select[@name='Date_Year']"));
                      System.out.println("totalYear="+yearlist.size());
                      for(int i=0;i<yearlist.size();i++)
                      {
                    	  System.out.println(yearlist.get(i).getText());
                      }
               
               driver.close();
               
	}

}
//https://is.rediff.com/signup/register