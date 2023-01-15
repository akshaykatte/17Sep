package Screenshot;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;



public class Prog3 {
	
	public static void m1() throws Exception
	{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = (WebDriver) new FirefoxDriverManager();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	 File source =((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE); 
	 File dest = new File("C:\\Users\\91899\\eclipse-workspace\\SEP17\\SShot/photoa.jpeg");
	 FileHandler.copy(source, dest); 

driver.close();
	}
	
	public static void main(String[] args) throws Exception {
		m1();
	}
}
