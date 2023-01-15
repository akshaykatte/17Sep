package Parameterization;

import java.io.File;


import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import	org.apache.poi.ss.usermodel.Sheet;
//import	org.apache.poi.ss.usermodel.WorkbookFactory

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import	org.openqa.selenium.io.FileHandler;

public class Prog {
// paratization 
	public static void main(String[] args) throws Exception {
                  System.setProperty("WebDriver.Chrome.Driver", "ChromeDriver");
                  WebDriver driver = new ChromeDriver();
                  driver.manage().window().maximize();
                  driver.get("https://is.rediff.com/signup/register");
                  
                  WebElement fullNameTextBox = driver.findElement(By.xpath("//input[@name='fullname']"));
                  WebElement emailIDTextBox = driver.findElement(By.xpath("//input[@name='emailid']"));
                  WebElement PasswardTextBox = driver.findElement(By.xpath("//input[@name='pass']"));
                  WebElement rePassTextBox = driver.findElement(By.xpath("//input[@name='repass']"));
                  WebElement genderRediobtn = driver.findElement(By.xpath("//input[@value='m']"));
                  WebElement dayDropDown = driver.findElement(By.xpath("//select[@name='date_day']"));
                  WebElement monthDropDown = driver.findElement(By.xpath("//select[@name='date_mon']"));
                  WebElement yearDropDown = driver.findElement(By.xpath("//select[@name='Date_Year']"));
                  WebElement locationTextBox = driver.findElement(By.xpath("//input[@name='city']"));
                  WebElement schoolTextBox =   driver.findElement(By.xpath("//input[@name='school']"));
                  WebElement collegeTextBox = driver.findElement(By.xpath("//input[@name='college']"));
                  WebElement captchaTextBox = driver.findElement(By.xpath("//input[@id='fld_captcha']"));

                  
                  
                  FileInputStream file  = new FileInputStream("C:\\Users\\91899\\eclipse-workspace\\SEP17\\TestData/RedifData.xlsx");
                  Sheet excel= WorkbookFactory.create(file).getSheet("Sheet1");
                  String value=excel.getRow(0).getCell(0).getStringCellValue();
                  
                  fullNameTextBox.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
                  emailIDTextBox.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());
                  PasswardTextBox.sendKeys(excel.getRow(0).getCell(2).getStringCellValue());
                  rePassTextBox.sendKeys(excel.getRow(0).getCell(3).getStringCellValue());
                  genderRediobtn.click();
                  
                  Select s1 = new Select(dayDropDown);
                  s1.selectByVisibleText(excel.getRow(0).getCell(4).getStringCellValue());
                  
                  Select s2= new Select(monthDropDown);
                  s2.selectByVisibleText(excel.getRow(0).getCell(5).getStringCellValue());
                  
                  Select s3= new Select(yearDropDown);
                  s3.selectByVisibleText(excel.getRow(0).getCell(6).getStringCellValue());
                  
                  locationTextBox.sendKeys(excel.getRow(0).getCell(7).getStringCellValue());
                  schoolTextBox.sendKeys(excel.getRow(0).getCell(8).getStringCellValue());
                  collegeTextBox.sendKeys(excel.getRow(0).getCell(9).getStringCellValue());
                  captchaTextBox.sendKeys(excel.getRow(0).getCell(10).getStringCellValue());
                  // screen shot
                  File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                  File dest = new File("C:\\Users\\91899\\eclipse-workspace\\SEP17\\SShot/photo2.jpeg");
                  FileHandler.copy(source ,dest);
                		  
                  
                  Thread.sleep(2000);
                  driver.close();
                  
	}

}
