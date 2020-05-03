package SFDC_Assignment.SFDC_Assignment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC_10  extends SfBrowserUtility{

	public static void main(String[] args) throws Exception {
		SfBrowserUtility.logintoSalesForceBrowser();
     	WebDriver driver = SfBrowserUtility.driver;
     	waitForPageElementToVisible(driver.findElement(By.xpath("//img[@class='allTabsArrow']")));
     	driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//input[@name='new']")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//input[@id='acc2']")).sendKeys(System.getProperty("accountname"));
     	 WebElement accounttype = driver.findElement(By.xpath("//select[@id='acc6']"));
 		Select typedropdown = new Select(accounttype);
 		typedropdown.selectByValue("Technology Partner"); 
 		driver.findElement(By.xpath("//input[@id='acc5']")).sendKeys(System.getProperty("accountnumber"));
 		WebElement priority = driver.findElement(By.id("00N5w00000HXjWI"));
 		Select prioritydropdown = new Select(priority);
 		prioritydropdown.selectByValue("High");
 		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']")).click();
 		
 		System.out.println("Test case Passed");
 }
}
