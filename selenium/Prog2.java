package selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("chrome.ChromeDriver", "ChromeDriver.exe");
		WebDriver Driver=new ChromeDriver();
		Thread.sleep(3000);
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		Driver.get("https://is.rediff.com/signup/register");
		
		String expTitle = "Rediff.com";

		        String actTitle = Driver.getTitle();
		        
		        if(expTitle.equals(actTitle))
		        	System.out.println("pass");
		        else
		        	System.out.println("fail");
		        
		        System.out.println("Actual title="+actTitle );
		        String currURL = Driver.getCurrentUrl();
		        System.out.println("URL :- " + currURL);
		        
		        Driver.close();
		        
		
	}

}
