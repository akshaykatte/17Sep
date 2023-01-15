package PopProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog {

	public static void main(String[] args) throws Exception {
                     System.setProperty("WebDriver.chrome.driver", "ChromeDriver");
                     WebDriver driver = new ChromeDriver();
                     driver.manage().window().maximize();
                     driver.get("https://www.flipkart.com/");
                     Thread.sleep(2000);
                     driver.findElement(By.xpath("//button[text()='X']")).click();
                     Thread.sleep(2000);
//                     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile");
//                     Thread.sleep(2000);
//                      driver.findElement(By.xpath("//button[@type='submit']")).click();
                      Thread.sleep(5000);

                     driver.close();
	}

}
