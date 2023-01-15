package FileUploadProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog {

	public static void main(String[] args) throws Exception {
            System.setProperty("WebDriver.chrome.driver", "ChromeDriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
            Thread.sleep(2000);
            WebElement chooseFile = driver.findElement(By.xpath("//input[@type='file']"));
            chooseFile.sendKeys("C:\\Users\\91899\\OneDrive\\Desktop\\ak.txt");
            Thread.sleep(2000);

            WebElement pressBtn = driver.findElement(By.xpath("//input[@type='submit']"));
            pressBtn.click();
            Thread.sleep(2000);
            driver.close();


	}

}
