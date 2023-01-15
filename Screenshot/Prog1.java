package Screenshot;

import java.io.File;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Prog1 {

	public static void main(String[] args) throws Exception {
           System.setProperty("WebDriver.Chromr.Driver", "ChromeDriver");
           WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.facebook.com/");
           
           File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           File dest = new File("C:\\Users\\91899\\eclipse-workspace\\SEP17\\SShot/photo6.jpeg");
           
           FileHandler.copy(Source ,dest);
          driver.close();
	}

}
