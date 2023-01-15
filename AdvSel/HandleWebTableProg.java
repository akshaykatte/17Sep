package AdvSel;

import java.util.List;        //Handle	web table


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebTableProg {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://money.rediff.com/index.html");
	    List<WebElement> tableRow = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
	    List<WebElement> tableRow1 = driver.findElements(By.xpath("//div[@class='hmnseindicestable']//ul"));
         WebElement logo=driver.findElement(By.xpath("//span[@class='block msprite moneywizlogo negative curhand']"));
              List<WebElement> links = driver.findElements(By.xpath("//table[@id='allpage_links']//a"));
	    for(int i=0;i<tableRow.size();i++)
	    {
	    	System.out.println(tableRow.get(i).getText());
	    }
	    System.out.println("...................................");
	    for(int i=0;i<tableRow1.size();i++)
	    {
	    	System.out.println(tableRow1.get(i).getText());
	    }
	    System.out.println("................");

	    System.out.println(logo.getText());
	    System.out.println("................");
	    for(int i=0;i<links.size();i++)
	    {
	    	System.out.println(links.get(i).getText());
	    }
driver.close();
	}

}
//https://money.rediff.com/index.html