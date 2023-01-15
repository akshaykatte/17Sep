package selenium;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Prog4 {

	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
         driver.get("https://is.rediff.com/signup/register");
        driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("Akshay Katte");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='emailid']")).sendKeys("akshay@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("Admin@123");
        Thread.sleep(2000);
        driver.findElement(By.name("repass")).sendKeys("Admin@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='m']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("date_day")).sendKeys("16");
        Thread.sleep(2000);
        driver.findElement(By.name("date_mon")).sendKeys("MAY");
        Thread.sleep(2000);
        driver.findElement(By.name("Date_Year")).sendKeys("1998");
        Thread.sleep(2000);
        driver.findElement(By.name("city")).sendKeys("Satara");
        Thread.sleep(2000);
        driver.findElement(By.name("school")).sendKeys("NHS");
        Thread.sleep(2000);
        driver.findElement(By.name("college")).sendKeys("Dahiwadi college Dahiwadi");
        Thread.sleep(2000);
        driver.findElement(By.xpath ("//a[text()='rediff.com'] ")).click();
        Thread.sleep(2000);
        driver.close();
	}

}
