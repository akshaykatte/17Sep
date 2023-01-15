package WaitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitProg {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait");
        
        
        // scenario 1
        
//        WebElement button = driver.findElement(By.xpath("//button[@id='alert']"));
//        button.click();
//        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
//        w.until(ExpectedConditions.alertIsPresent());// explicite wait
//        driver.switchTo().alert().accept();// it will handel the alert popup
      
        // scenario 2
        
//        WebElement button1 = driver.findElement(By.xpath("//button[@id='populate-text']"));
//        WebElement text = driver.findElement(By.xpath("//h2[@id='h2']"));
//        button1.click();
//        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
//        w.until(ExpectedConditions.textToBePresentInElement(text, "Selenium Webdriver"));
        
        // scenario 3
//        WebElement button2 = driver.findElement(By.xpath("//button[@id='display-other-button']"));
//        WebElement hidden = driver.findElement(By.xpath("//button[@id='hidden']"));
//        button2.click();
//        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
//        w.until(ExpectedConditions.elementToBeClickable(hidden));
        
        // scenario 4
//        WebElement button3 =driver.findElement(By.xpath("//button[@id='enable-button']"));
//        WebElement button = driver.findElement(By.xpath("//button[@id='disable']"));
//        button3.click();
//        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
//        w.until(ExpectedConditions.elementToBeClickable(button));
        
        // scenario 5 
         WebElement button4 = driver.findElement(By.xpath("//button[@id='checkbox']"));
         WebElement check = driver.findElement(By.xpath("//input[@id='ch']"));
         button4.click();
         WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
        w.until(ExpectedConditions.elementToBeSelected(check));
        driver.close();
	}

}

