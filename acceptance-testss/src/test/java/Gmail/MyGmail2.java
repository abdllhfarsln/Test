package Gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cucumber.api.java.hu.De;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyGmail2 {

		public static void main(String[] args) throws InterruptedException {
			
		

	
	
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdllhfarsln\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://mail.google.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abdullah.farslan" + Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nrnygmr83512" + Keys.ENTER);
		driver.findElement(By.xpath("//div[@id=':2i']")).click();
		
		
		
		
		
		
		WebElement star = driver.findElement(By.xpath("(//span[@class='aXw T-KT'])[3]"));
		
		
		
		
		while(5 >0) {
			WebElement Select = driver.findElement(By.xpath("//span[@role='checkbox']"));				
			Select.click();
		
	
			WebElement Delete =	driver.findElement(By.xpath("//div[contains(@class, 'asa')]"));
					Delete.click();
			Thread.sleep(6000);
					
			
//			if(!star.isDisplayed()){
//					break;
//						
//					}
					
				
		}
		
		}
		
	
}
