package PopProgram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AltPro {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chrome.driver", "ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
  		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Thread.sleep(1000);
         driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
 		Thread.sleep(2000);
         Alert z =driver.switchTo().alert();
         System.out.println(z.getText());
  		Thread.sleep(5000);
  		z.sendKeys("akshay");
  		Thread.sleep(5000);
         z.accept();
		driver.close();

	}

}
//        driver.findElement(By.xpath("")).click();
