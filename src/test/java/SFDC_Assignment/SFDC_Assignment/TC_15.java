package SFDC_Assignment.SFDC_Assignment;

import java.util.List;

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
     //	WebElement Opportunities = driver.findElement(By.id("//select[@id='fcf']"));
     	//Opportunities.click();
		Select optdropdown = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		List <WebElement> optdd = optdropdown.getOptions();
		System.out.println(optdd.size());
		
		/*for (int i =0; i< optdd.size(); i++) {
			System.out.println(optdd.get(i).getText());
		}*/
	}

}
