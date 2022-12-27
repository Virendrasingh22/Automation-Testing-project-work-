package automationtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinksscript {

	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("WebDriver.chrome..driver","c://chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.eroomrent.in");
		
			driver.manage().window().maximize();
			
		
			List<WebElement> links = driver.findElements(By.tagName("a"));
			
		
			System.out.println("Total number of links present on the page: "+links.size());
			
			//Create a counter to count the number of broken links
			int counter = 0;
			
			//Loop to access each link
			for(int i = 0; i<links.size(); i++)
			{
				//Get the url of each link
				String url = links.get(i).getAttribute("href");
				
				//Check if the link is broken
				if(url == null || url.isEmpty()){
					counter++;
					System.out.println("Broken Link at position " + (i+1) + ": " + links.get(i).getText());
				}
			}
			
			//Print the total number of broken links
			System.out.println("Total number of broken links present on the page: "+counter);
			
			//Close the browser
			driver.quit();
		

	
	}

}
