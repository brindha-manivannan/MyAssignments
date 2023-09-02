package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		WebElement dropdownDD=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select sec=new Select(dropdownDD);
		sec.selectByVisibleText("Selenium");
		WebElement countryDD = driver.findElement(By.xpath("//label[@id='j_idt87:country_label']"));
		Select sec1=new Select(countryDD);
		
	}

}
