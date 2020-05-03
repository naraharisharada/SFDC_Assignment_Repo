package SFDC_Assignment.SFDC_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_16 extends SfBrowserUtility{

	public static void main(String[] args) throws Exception{
		SfBrowserUtility.logintoSalesForceBrowser();
     	WebDriver driver = SfBrowserUtility.driver;
     	waitForPageElementToVisible(driver.findElement(By.xpath("//li[@id='Opportunity_Tab']")));
     	driver.findElement(By.xpath("//li[@id='Opportunity_Tab']")).click();
     	driver.findElement(By.xpath("//input[@name='new']")).click();
     	
	}

}
