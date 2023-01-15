package PopProgram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws Exception {
   System.setProperty("WebDriver.chrome.driver", "ChromeDriver");
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demoqa.com/alerts");  
   
     driver.findElement(By.xpath("//button[@id='alertButton']")).click();
     Alert z = driver.switchTo().alert();
     Thread.sleep(2000);

      z.accept();
    
   driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
   Thread.sleep(6000);
   z.accept();
   

   driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
   Thread.sleep(2000);

   z.accept();
   Thread.sleep(2000);

   driver.findElement(By.xpath("//button[@id='promtButton']")).click();
   Thread.sleep(2000);

   z.accept(); 
   Thread.sleep(2000);

   driver.close();
   
   
   
   
   
	}

}
