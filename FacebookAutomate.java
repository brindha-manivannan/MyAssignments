package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomate {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String Title =driver.getTitle();
		System.out.println(Title);
		
		Thread.sleep(2000);
		driver.close();
		
	}
	
 
}
