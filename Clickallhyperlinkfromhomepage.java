package automationtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickallhyperlinkfromhomepage {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome..driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.eroomrent.in/");
	List<WebElement> s =	driver.findElements(By.tagName("a"));
	for(WebElement link:s) {
		driver.
		link.click();
		driver.navigate().back();
	
	}
		
	}

}
