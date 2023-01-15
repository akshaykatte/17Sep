package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffSanity {

	public static void main(String[] args) {
		 System.setProperty("WebDriver.Chrome.Driver", "ChromeDriver");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://is.rediff.com/signup/register");
         
         WebElement rediffLink = driver.findElement(By.xpath("//a[@class='ft11']"));
         WebElement rediffLogo = driver.findElement(By.xpath("//img[@class='halflogo']"));
         WebElement newuserLabe = driver.findElement(By.xpath("//b[text()='New User? Register here']"));
         WebElement tellUsLable = driver.findElement(By.xpath("//p[@class='grey1']"));
         WebElement textBoxName = driver.findElement(By.xpath("//div[text()='Your Full name']"));
    
         
         
         
         
         
         int count=0;
         if((rediffLink.isDisplayed())==true)
         {
        	 System.out.println("link is available");
        	 count++;
         }
         else {
        	 System.out.println("link is not available ");
         }
         if((rediffLogo.isDisplayed())==true)
         {
        	 System.out.println("Logo is available");
        	 count++;
         }
         else
         {
        	 System.out.println("Logo is not available");
         }
         String expNewuserLabe="New User? Register here";
         String actNewuserLabe=newuserLabe.getText();
         if(expNewuserLabe.equals(actNewuserLabe))
         {
        	 System.out.println("correct");
        	 count++;
         }
         else
         {
        	 System.out.println("Incorrect");
         }
         String expTellUsLable="Tell us a few things about yourself and we will help you find classmates and\n" + 
         		"other friends among rediff.com's millions of world-wide users.";
         String actTellUsLable=tellUsLable.getText();
         if(expTellUsLable.equals(actTellUsLable))
         {
        	 System.out.println("correct");
        	 count++;
         }
         else
         {
        	 System.out.println("Incorrect");
         }
         if((textBoxName.isDisplayed())==true)
         {
        	 System.out.println("text box name is available");
        	 count++;

         }
         else {
        	 System.out.println("text box name is not available");
         }
         
         
         
         System.out.println("total count elements are="+count);
         driver.close();

	}

}
