package PopProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowProg {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		String Parent = driver.getWindowHandle();
		System.out.println("parent windowId-"+Parent);
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
	   //  driver.findElement(By.xpath("//span[text()='Home']")).click();
		

		        Set<String> windows = driver.getWindowHandles();
//		        
//		        for(String abc : windows)
//		        {
//		        	System.out.println(abc);
//		        }
		        Iterator val= windows.iterator();
		        
		         
		         Object parentWindowId = val.next();
		         Object childWindowID = val.next();


		         System.out.println(parentWindowId);
		         System.out.println(childWindowID);
		         driver.switchTo().window((String) parentWindowId);
		         System.out.println("title="+driver.getTitle());
	 		
		         driver.switchTo().window((String) childWindowID);
                 System.out.println("titlechild="+driver.getTitle());
               
               
          Thread.sleep(5000);
		driver.quit();
		
		
//CDwindow-978BA3723AA9B8F32D0BCA5131A322F3
//CDwindow-3A35F052060540A99B2551E076B7ECBF

	}

}
//("https://www.aspsnippets.com/demos/1102/")       //https://www.hyrtutorials.com/p/window-handles-practice.html