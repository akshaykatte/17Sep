package selenium;
import	org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91899\\eclipse-workspace\\SEP17\\chromedriver.exe");
		WebDriver driver =	new	ChromeDriver();
		driver.get("https://www.instagram.com/");

	}

}
