package SFDC_Assignment.SFDC_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC_15 extends SfBrowserUtility {

	public static void main(String[] args) throws Exception{
		SfBrowserUtility.logintoSalesForceBrowser();
     	WebDriver driver = SfBrowserUtility.driver;
     	waitForPageElementToVisible(driver.findElement(By.id("Opportunity_Tab")));
     	driver.findElement(By.id("Opportunity_Tab")).click();
     	//driver.findElement(By.xpath("//select[@id='00B5w00000D6tfW_listSelect']"));
     	WebElement opportunity = driver.findElement(By.id("//select[@name='fcf']"));
		Select optdropdown = new Select(opportunity);
		optdropdown.selectByValue("00B5w00000D6thG");;
     	
     	//driver.findElement(By.xpath("//select[@id='00B5w00000D6tfW_listSelect']")).getText();
	}

}
