package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Brindha");
		driver.findElement(By.id("lastNameField")).sendKeys("Manivannan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Dinesh");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Kumar");
		driver.findElement(By.name("departmentName")).sendKeys("ECE");
		driver.findElement(By.name("description")).sendKeys("test");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("mbrindha37@gmail.com");
		WebElement state=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select sec=new Select(state);
		sec.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_description")).sendKeys("updatethedescription");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title=driver.getTitle();
		System.out.println("title");
		
		
		
		

	}

}
