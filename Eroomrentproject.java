package automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eroomrentproject {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome..driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.eroomrent.in/ownerreg.php");
		driver.findElement(By.xpath("//*[@id='txtfname']")).sendKeys("Rakesh singh");
		driver.findElement(By.xpath("//*[@name='txtmobile1']")).sendKeys("9826724824");
		driver.findElement(By.xpath("//*[@id='txtpass']")).sendKeys("Rakesh.123");
		driver.findElement(By.xpath("//*[@name='txtConfirmPassword']")).sendKeys("Rakesh.123");
		driver.findElement(By.xpath("//*[@name='txtEmail']")).sendKeys("Rakayadav@gmail.com");
		driver.findElement(By.xpath("//*[@name='btnsubmit']")).click();
		
		

	}

}
