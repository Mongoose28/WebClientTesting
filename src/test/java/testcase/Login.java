package testcase;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;

public class Login extends BaseTest {
	
	
	@Test
	public static void loginTest() throws InterruptedException {
		
		
		    driver.findElement(By.id("userName")).click();
		    driver.findElement(By.id("userName")).sendKeys("appadmin");
		    //driver.findElement(By.cssSelector(".VfPpkd-LgbsSe-OWXEXe-k8QpJ > .VfPpkd-vQzf8d")).click();
		    driver.findElement(By.id("password")).click();
		    driver.findElement(By.id("password")).sendKeys("123456");
		    driver.findElement(By.cssSelector(".btn-gradient-primary")).click();
			Thread.sleep(2000);
			
			{
			WebElement dropdown = driver.findElement(By.cssSelector(".company-list"));
		    dropdown.findElement(By.xpath("//option[. = 'Mysoft Ltd (Unit-1)']")).click();
			}
			driver.findElement(By.cssSelector("option:nth-child(2)")).click();
		    driver.findElement(By.cssSelector(".btn-gradient-primary")).click();
		    Thread.sleep(2000);
	}

}
