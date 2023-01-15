package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.Chrome.Driver", "ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		 driver.switchTo().frame("iframeResult");
		 
		 driver.findElement(By.xpath("//button[@type='button']")).click();
		 Thread.sleep(2000);
		 driver.switchTo().defaultContent();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		 driver.quit();

		 

	}

}
