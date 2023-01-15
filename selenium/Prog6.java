package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog6 {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.Chrome.Driver", "ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(2000);
		WebElement NewUserLable=driver.findElement(By.xpath("//b[text()='New User? Register here']"));
		WebElement TellUsLable =driver.findElement(By.xpath("//p[@class='grey1']"));
		//String str1 = NewUserLable.getText();
		//String str2 = TellUsLable.getText();
		//System.out.println(str1);
		//System.out.println(str2);
        System.out.println("Lable1="+NewUserLable.getText());
		
        System.out.println("Lable2="+TellUsLable.getText());
 
		driver.close();
		
		

	}

}
