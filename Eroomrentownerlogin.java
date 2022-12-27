package automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eroomrentownerlogin {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome..driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.eroomrent.in/ownerlogin.php");
		driver.findElement(By.xpath("//*[@name='txtEmail']")).sendKeys("Rakayadav@gmail.com");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("Rakesh.123");
		driver.findElement(By.xpath("//*[@name='btnsubmit']")).click();
	}

}
