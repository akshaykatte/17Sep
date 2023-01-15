package AdvSel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {// handel multiple broweser

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.get("https://skpatro.github.io/demo/links/");

		Thread.sleep(2000);
		String wind=driver.getWindowHandle();// it will return windowId of main page that mean parentwindow
		System.out.println("parent windowID-"+wind);
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();// this method click on parent window element 
	                                                                    //and open another window
		Set<String> window = driver.getWindowHandles();
		// this set collection will return all windows id of webpages means 
		// parent window child window will retun all value in set collection.
		//in set dublication value not allowed so use set.
		Iterator<String> val=window.iterator();// iterator will fetch the all windows id from set.
		
            String parentWindow = val.next();// it will return main(parent) page window id.
            System.out.println(parentWindow);
		
            String childWindow = val.next();//it will return child page window id.
            System.out.println(childWindow);
            
            
            driver.switchTo().window(childWindow);// whenever we want perfrom any operation on child window
             // then we need to use driver,switchto().window(child).
            // oherwise it will give( no such element exception )
		WebElement tex = driver.findElement(By.xpath("//h4[@class='vc_custom_heading']"));
		System.out.println(tex.getText());// it will return the text present on child browesr 
		
            driver.close();// thesr method close the child browser...it not close by default
            
            
		//Thread.sleep(5000);
		driver.quit();// it will close the all tab or browser.
	}

}
