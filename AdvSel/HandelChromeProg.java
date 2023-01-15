package AdvSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelChromeProg {
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.Driver", "ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("current title1="+driver.getTitle());

		  List<WebElement> links = driver.findElements(By.xpath("//a"));
		  System.out.println("Total links are present on the webpage are="+ links.size());
		  
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		for(int i=0;i<links.size();i++)
		{
			String actname="Privacy";
			String expname=links.get(i).getText();
			if(actname.equals(expname))
			{
				links.get(i).click();
				break;
			}
		}
		System.out.println("current title2="+driver.getTitle());
driver.close();
	}

}
