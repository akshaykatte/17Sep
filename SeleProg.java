import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleProg {
	public static void main(String[] args) throws Exception {
		System.setProperty("webDriver.chrome.driver","chromeDriver" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
        driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akshay");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("katte");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("akshaykatte4780@gmail.com");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("akshaykatte4780@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Akshay@123");
		Thread.sleep(2000);
         driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("16");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("May");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1998");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='2']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        Thread.sleep(2000);
        driver.close();
		
		
		
		
		
	}


}
