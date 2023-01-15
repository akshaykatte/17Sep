package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Prog {

	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.Chrome.Driver", "ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest = new File("C:\\Users\\91899\\eclipse-workspace\\SEP17\\SShot/photo.jpeg");
	    FileHandler.copy(source,dest);

	    
		
		driver.close();

	}

}
