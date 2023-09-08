package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Brindha");
		driver.findElement(By.name("lastname")).sendKeys("Manivannan");
		driver.findElement(By.name("reg_email__")).sendKeys("9384431309");
		driver.findElement(By.name("reg_passwd__")).sendKeys("leaftest");
		
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sec=new Select(day);
		sec.selectByValue("7");
		
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sec1=new Select(month);
		sec1.selectByVisibleText("May");
		
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select sec2=new Select(year);
		sec2.selectByValue("1998");
		driver.findElement(By.name("sex")).click();
		//driver.findElement(By.name("websubmit")).click();
		
		
		
		

	}

}
