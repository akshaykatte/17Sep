package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog8 {

	public static void main(String[] args) throws Exception {
                System.setProperty("WebDriver.Chrome.Driver", "ChromeDriver");
                WebDriver driver = new ChromeDriver();
                driver.get("https://is.rediff.com/signup/register");
                driver.manage().window().maximize();
                Thread.sleep(2000);
               /* WebElement NewUserLabel=driver.findElement(By.xpath("//div[contains(text(),'Your Full name')]"));
                String expLabel="Your Full name";
                String actLabel= NewUserLabel.getText();
                if(expLabel.equals(actLabel))
                	System.out.println("Correct");
                else
                	System.out.println("Wrong");*/
                WebElement	day	=	
                		driver.findElement(By.xpath("//select[@id='date_day']"));
                		WebElement	month	=	
                		driver.findElement(By.xpath("//select[@id='date_mon']"));
                		WebElement	year	=	
                		driver.findElement(By.xpath("//select[@name='Date_Year']"));
                		
                		Select	s1	=	new	Select(day);
                		//s1.selectByIndex(0);
                		//Thread.sleep(2000);
//                		s1.selectByValue("09");
//                		Thread.sleep(2000);
                		List<WebElement>	allDays	=	s1.getOptions();
                		for(int	i=1;i<32;i++)
                			System.out.println(allDays.get(i).getText());
                			System.out.println("--------");
                			for(int	i=1;i<allDays.size();i++)
                			System.out.println(allDays.get(i).getText());
                		
                driver.close();
                
	}

}
