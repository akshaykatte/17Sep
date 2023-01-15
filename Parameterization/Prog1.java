package Parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Prog1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.Chrome.Driver", "ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement emailTextBox = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement passTextBox = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement submitBtn = driver.findElement(By.xpath("//button[@name='login']"));
		FileInputStream file = new FileInputStream("C:\\Users\\91899\\eclipse-workspace\\SEP17\\TestData/RedifData.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet2");
		String value = excel.getRow(0).getCell(0).getStringCellValue();
				
		emailTextBox.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
		passTextBox.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());
		submitBtn.click();
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File("C:\\Users\\91899\\eclipse-workspace\\SEP17\\SShot/Photoo.jpeg");
		 FileHandler.copy(source ,dest );
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		

	}

}
