package SFDC_Assignment.SFDC_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_11 extends SfBrowserUtility {

	public static void main(String[] args) throws Exception{
		SfBrowserUtility.logintoSalesForceBrowser();
     	WebDriver driver = SfBrowserUtility.driver;
     	waitForPageElementToVisible(driver.findElement(By.xpath("//img[@class='allTabsArrow']")));
     	driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
     	waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='fname']")));
     	driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(System.getProperty("viewname"));
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//input[@id='devname']")).sendKeys(System.getProperty("uniqviewname"));
     	driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")).click();
     	//test case passed
	}

}
