package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTaps 
	
{
	public static void main(String[]args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.id("numberEmployees")).sendKeys("4");
		
		driver.findElement(By.id("officeSiteName")).sendKeys("Leaf Taps");
		
		driver.findElement(By.className("smallSubmit")).click();
		
	
		
		
		
		
		
		
		
		
		
	}
}