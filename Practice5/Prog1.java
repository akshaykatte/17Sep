package Practice5;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog1 extends Prog {
	
	
	@Override
	public void Screenshot() throws Exception {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File("C:\\Users\\91899\\eclipse-workspace\\SEP17\\SShot/akshay.jpeg");
		 FileHandler.copy(source, dest);
		 super.ListBox();
		 driver.close();

	}

	public static void main(String[] args) throws Exception {
		
	
		Prog1 x = new Prog1();
		x.Screenshot();
	
		

	}

	

}
