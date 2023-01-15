package selenium;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Prog1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("chrome.ChromeDriver","ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
	Thread.sleep(5000);
		driver.manage().window().maximize();
	Thread.sleep(5000);
		
		driver.get("https://www.facebook.com/");
       Thread.sleep(5000);
     
       driver.navigate().to("https://www.onlineservices.nsdl.com/paam/endUserRegisterContact.html");
       Thread.sleep(5000);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.navigate().forward();
       Thread.sleep(5000);
       driver.close();
       
        
        
        
	}

}