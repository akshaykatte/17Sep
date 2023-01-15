package ActionclassProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragProgram {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement iFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iFrame);
		  
		WebElement 	highTatras1Img = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement 	highTatras2Img = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));

		WebElement 	highTatras3Img = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));

		WebElement 	highTatras4Img = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
        WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		a.dragAndDrop(highTatras1Img, trash).build().perform();
		Thread.sleep(1000);

		a.dragAndDrop(highTatras2Img, trash).build().perform();
		Thread.sleep(1000);

		a.dragAndDrop(highTatras3Img, trash).build().perform();
		Thread.sleep(1000);

		a.dragAndDrop(highTatras4Img, trash).build().perform();
		Thread.sleep(1000);
        driver.close();

	}

}
