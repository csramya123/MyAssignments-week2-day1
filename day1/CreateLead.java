package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CMPYNAME4522");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("CS");
		
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select src=new Select(source);
		src.selectByVisibleText("Employee");
		
		WebElement marketing=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mkt=new Select(marketing);
		mkt.selectByValue("9001");
		
		WebElement owner=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select own=new Select(owner);
		own.selectByIndex(5);
		
		WebElement country=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select count=new Select(country);
		count.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		//driver.close();
	}
}