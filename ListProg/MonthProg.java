package ListProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MonthProg {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		    List<WebElement> month = driver.findElements(By.xpath("//select[@name='date_mon']"));
            List<WebElement> yearlist = driver.findElements(By.xpath("//select[@name='Date_Year']"));
            List<WebElement> dayList = driver.findElements(By.xpath("//select[@name='date_day']"));
            
            
		for(int i=0;i<month.size();i++)
		{
			System.out.println(month.get(i).getText());
		}
		
		System.out.println(".................");
		for(int i=0;i<yearlist.size();i++)
		{
			System.out.println(yearlist.get(i).getText());
		}
		
		

		
		System.out.println(".................");

		for(int i=0;i<dayList.size();i++)
		{
			System.out.println(dayList.get(i).getText());
		}
		


		driver.close();

	}

}
