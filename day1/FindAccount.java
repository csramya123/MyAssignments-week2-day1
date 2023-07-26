package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select ind=new Select(industry);
		ind.selectByValue("IND_SOFTWARE");
		Thread.sleep(3000);
		
		WebElement currency=driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select cur=new Select(currency);
		cur.selectByIndex(5);
		Thread.sleep(3000);
		
		WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select own=new Select(ownership);
		own.selectByVisibleText("Partnership");
		Thread.sleep(3000);
	}

}
