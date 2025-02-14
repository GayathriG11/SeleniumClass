package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Gayathri");
		
		driver.findElement(By.name("lastname")).sendKeys("G");
		
		WebElement dateElement = driver.findElement(By.id("day"));
		
		WebElement monthElement = driver.findElement(By.id("month"));
		
		WebElement yearElement = driver.findElement(By.id("year")); 
		
		Select datedropdown = new Select(dateElement);
		
		Select monthdropdown = new Select(monthElement);
		
		Select yeardropdown = new Select(yearElement);
		
		datedropdown.selectByVisibleText("11");
		
		monthdropdown.selectByVisibleText("Jun");
		
		yeardropdown.selectByVisibleText("1993");
		
		driver.findElement(By.name("reg_email__")).sendKeys("gayathrimurthy");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Gaya3");
		
		
		
		
		
	
		
		

	}

}
