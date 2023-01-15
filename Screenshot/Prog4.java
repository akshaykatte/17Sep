package Screenshot;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog4 {
	public static void logoScreenshot() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement amazonLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));

		File source = amazonLogo.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\91899\\eclipse-workspace\\SEP17\\SShot/facebook.jpeg");
		FileHandler.copy(source, dest);
		driver.close();
		
		
		
	}
	
	

	public static void main(String[] args) throws Exception {
		
		logoScreenshot();
		
		

	}

}
