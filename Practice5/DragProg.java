package Practice5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragProg {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement bank = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement sales = driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement fT1 = driver.findElement(By.xpath("//li[@id='fourth']"));
		WebElement fT2 = driver.findElement(By.xpath("//li[@id='fourth']"));
		WebElement account = driver.findElement(By.xpath("//ol[@id='bank']"));//bank
		WebElement amount = driver.findElement(By.xpath("//ol[@id='amt7']"));
		WebElement account1 = driver.findElement(By.xpath("//ol[@id='loan']"));//sales

		WebElement amount1 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		WebElement perfect =driver.findElement(By.xpath("//div[@class='table4_result']"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		
		a.dragAndDrop(bank, account).build().perform();
		Thread.sleep(2000);

		a.dragAndDrop(sales, account1).build().perform();
		Thread.sleep(2000);

		a.dragAndDrop(fT1, amount).build().perform();
		Thread.sleep(2000);

		a.dragAndDrop(fT2, amount1).build().perform();
		Thread.sleep(2000);
        System.out.println(perfect.isDisplayed());
        System.out.println(perfect.getText());
       driver.close();
	
		
	}

}
