package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog7 {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDrive.Chrome.Drive", "ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://chercher.tech/practice/explicit-wait");
		WebElement Button=driver.findElement(By.xpath("//button[@id='disable']"));
		System.out.println(Button.isDisplayed());
		System.out.println(Button.isEnabled());
		System.out.println("................................");
	   driver.findElement(By.xpath("//button[@id='enable-button']")).click();;
	   Thread.sleep(10000);
	    System.out.println(Button.isDisplayed());
		System.out.println(Button.isEnabled());
		
		

		driver.close();

	}

}
