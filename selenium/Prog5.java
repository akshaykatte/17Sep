package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog5 {
	// facebook

	public static void main(String[] args) throws Exception  {
                     System.setProperty("webdriver.chrome.Driver","chromedriver" );
                     WebDriver driver = new ChromeDriver();
                     driver.manage().window().maximize();
                     
                     driver.get("https://www.facebook.com/");
                     Thread.sleep(2000);
                     driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akshay@gmail.com");
                     Thread.sleep(2000);
                     driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Akshay@123");
                     Thread.sleep(2000);
                      driver.findElement(By.xpath("//button[@name='login']")).click();
                      Thread.sleep(5000);
                      driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
                      Thread.sleep(5000);
                     driver.close();
                     
	}

}
