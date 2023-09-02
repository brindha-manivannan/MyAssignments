package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//form[@class='css-19j7d8y']")).sendKeys("dress");
		//driver.findElement(By.xpath("//input[@name='search-suggestions-nykaa']parent::form"));

	}

}
