package Practice5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonautopro {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/ref=nav_logo");
 WebElement serTextBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
 WebElement submitBtn = driver.findElement(By.xpath("//span[@id='nav-search-submit-text']"));

 serTextBox.sendKeys("book");
 Thread.sleep(2000);
 submitBtn.click();
 Thread.sleep(2000);
 WebElement bok=driver.findElement(By.xpath("//span[text()='Do It Today: Overcome Procrastination, Improve Productivity']"));
 bok.click();

// Actions a = new Actions(driver);
// a.moveToElement(bok).click().build().perform();
// Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Buy now']")).click();
Thread.sleep(2000);
driver.quit();
	}

}
