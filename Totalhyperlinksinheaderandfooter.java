package automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totalhyperlinksinheaderandfooter {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome..driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.eroomrent.in/");
		// Total links in Header section 
	    WebElement s= driver.findElement(By.tagName("nav"));
		int n = s.findElements(By.tagName("a")).size();
		System.out.println("Total links in Header are " + n);
		
		//Total links in footer section 
		 WebElement k= driver.findElement(By.tagName("footer"));
			int g = k.findElements(By.tagName("a")).size();
			System.out.println("Total links in Header are " + g);
		
				
				
			
				
		
		
	}

}
