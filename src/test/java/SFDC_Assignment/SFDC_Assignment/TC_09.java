package SFDC_Assignment.SFDC_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_09 extends SfBrowserUtility {

	public static void main(String[] args) throws Exception {
		SfBrowserUtility.logintoSalesForceBrowser();
     	WebDriver driver = SfBrowserUtility.driver;
     	waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
     	driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
    	waitForPageElementToVisible(driver.findElement(By.xpath("//div[@id='userNav-menuItems']")));
    	driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    	System.out.println("Test case Passed");
        driver.quit();
	}

}
