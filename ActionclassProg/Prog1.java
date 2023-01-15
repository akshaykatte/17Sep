package ActionclassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog1 {

	public static void main(String[] args) throws Exception {
           System.setProperty("Webdriver.chrome.driver", "ChromeDriver");
           WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
           
           WebElement mobileNumTextBox = driver.findElement(By.xpath("//input[@id='user-number']"));
           WebElement emailIdTextBox = driver.findElement(By.xpath("//input[@id='email_id']"));
           WebElement conBtn = driver.findElement(By.xpath("//button[@id='irtct-acc-detail']"));
           
           mobileNumTextBox.sendKeys("8989898958");
           Thread.sleep(2000);
           emailIdTextBox.sendKeys("khaladi@gamil.com");
           Thread.sleep(2000);

           conBtn.click();
           
           WebElement accDropDown = driver.findElement(By.xpath("//button[normalize-space(text())='Select Occupation']"));
            
           Actions z = new Actions(driver);
           z.moveToElement(accDropDown).click().build().perform();

           for(int i=0;i<=5;i++)
           {
               Thread.sleep(1000);

        	   z.sendKeys(Keys.DOWN).build().perform();
           }
           
          z.sendKeys(Keys.ENTER).build().perform();
          Thread.sleep(2000);

           driver.close();

	}

}
