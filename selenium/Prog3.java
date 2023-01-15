package selenium;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.chrome.driver", "chromedriver");
	           WebDriver driver = new ChromeDriver();
	           Thread.sleep(2000);
	           driver.manage().window().maximize();
	           
	           Thread.sleep(2000);
	           driver.get("https://is.rediff.com/signup/register");
	           
	           Thread.sleep(2000);
	           Dimension d = new Dimension(200, 300);
	           driver.manage().window().setSize(d);
	           Thread.sleep(5000);
	            
	           Point p = new Point(10,700);
	           driver.manage().window().setPosition(p);
	           Thread.sleep(5000);
	           driver.close();
		
		
	}

}
