package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Brindha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manivannan");
		WebElement dropdownDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec = new Select(dropdownDD);
		sec.selectByVisibleText("Employee");
		WebElement CampaignMC = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec1 = new Select(CampaignMC);
		sec1.selectByValue("Pay Per Click Advertising");
		WebElement OwnershipOO= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sec2 = new Select(OwnershipOO);
		sec2.selectByIndex(5);
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
	}

}
