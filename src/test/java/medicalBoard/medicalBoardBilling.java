package medicalBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class medicalBoardBilling extends BaseTest{
	
	@Test(dataProviderClass=ReadXLSdata.class,dataProvider="testdata")
	public static void medicalbilling(String Fname, String Lname, String Age, String Contact, String Address, String medicalBoard, String Pamount) throws InterruptedException  {
		
		    Thread.sleep(5000);
		    driver.findElement(By.cssSelector("#allf > div:nth-child(2) > div > .dropdown-btn")).click();
		    driver.findElement(By.cssSelector("#allf > div:nth-child(2) .dropdown-container > div:nth-child(1) .dropdown-btn")).click();
		    driver.findElement(By.linkText("Order Entry Medical Board")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.name("patientTypeName")).click();
		    {
		    WebElement dropdown = driver.findElement(By.name("patientTypeName"));
		    dropdown.findElement(By.xpath("//option[@value='0: Object']")).click();
		    }
		    driver.findElement(By.xpath("//option[contains(.,\' General Patient \')]")).click();
		    
		 
		    Thread.sleep(5000);		  
		    driver.findElement(By.name("fname")).sendKeys(Fname);		    
		    driver.findElement(By.name("lname")).sendKeys(Lname);
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("(//input[@type=\'text\'])[4]")).click();
		    driver.findElement(By.xpath("//div[@id=\'core-home-layout\']/main/div/app-medical-board-billing/div/div/div/div/div/div[2]/div/div[2]/div/div/table/tbody/tr[2]/td/ng-select/div/span")).click();
		    driver.findElement(By.cssSelector(".ng-select-bottom .ng-arrow-wrapper")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//ng-dropdown-panel/div/div[2]/div")).click();

		    
		    Thread.sleep(2000);
		   
		    driver.findElement(By.name("ageYear")).sendKeys(Age);
		 
		    driver.findElement(By.name("contactField")).sendKeys(Contact);
		  
		    driver.findElement(By.name("address")).sendKeys(Address);
	
		    driver.findElement(By.name("medBoardName")).sendKeys(medicalBoard);
		  
		    driver.findElement(By.name("diagnosis")).sendKeys("asthma");
		    driver.findElement(By.xpath("//div[2]/div/table/tbody/tr/td/input")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[@id=\'core-home-layout\']/main/div/app-medical-board-billing/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/table/tbody/tr/td/input")).click();
		    driver.findElement(By.xpath("//div[@id=\'core-home-layout\']/main/div/app-medical-board-billing/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/table/tbody/tr/td/input")).sendKeys("dr");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[@id=\'core-home-layout\']/main/div/app-medical-board-billing/div/div/div/div/div/div[2]/div/div[3]/div[2]/div/table/tbody/tr/td/typeahead-container/button[4]/table/tbody/tr/td")).click();
		    
		    driver.findElement(By.name("doctorSelect")).click();
		    driver.findElement(By.cssSelector("td > .btn-success")).click();
		    driver.findElement(By.cssSelector("tr:nth-child(2) .rightAilgn")).click();
		    driver.findElement(By.cssSelector("tr:nth-child(2) .rightAilgn")).sendKeys(Pamount);
		    driver.findElement(By.xpath("//button[contains(.,\' Save and Print\')]")).click();
		    driver.findElement(By.xpath("//button[contains(.,\'Yes\')]")).click();
		    Thread.sleep(2000);
		    
		    
		    
		    
		    
		   
			
		    
	}

}
