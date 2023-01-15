package Selenium_practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws Exception {
             System.setProperty("WebDriver.Chrome.Driver", "chromeDriver");
             WebDriver driver = new ChromeDriver();
             driver.manage().window().maximize();
             driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
             Thread.sleep(2000);
             WebElement Text = driver.findElement(By.xpath("//td[@class='f22']"));
             WebElement textName=driver.findElement(By.xpath("//td[text()='Choose a Rediffmail ID']"));
             Thread.sleep(2000);
             String str=Text.getText();
             System.out.println(str);
             if((Text.isDisplayed())==true)
             {
            	 System.out.println("yes");
             }
             else
             {
            	 System.out.println("not");
            	 
             }
             String expTextName="Choose a Rediffmail ID";
             String actTextName=textName.getText();
             if(expTextName.equals(actTextName))
             {
            	 System.out.println("true");
             }
             else
             {
            	 System.out.println("false");
             }
             
             driver.close();
             
           //td[@class='f22']
	}

}
