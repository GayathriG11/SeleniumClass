package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLeafTaps {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gayathri");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gurumurthy");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestleafOperation");
		
		driver.findElement(By.className("smallSubmit")).click();

	}

}
