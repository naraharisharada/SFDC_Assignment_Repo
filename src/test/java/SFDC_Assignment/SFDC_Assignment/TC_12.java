package SFDC_Assignment.SFDC_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_12 extends SfBrowserUtility {

	public static void main(String[] args) throws Exception {
		SfBrowserUtility.logintoSalesForceBrowser();
     	WebDriver driver = SfBrowserUtility.driver;
     	waitForPageElementToVisible(driver.findElement(By.xpath("//img[@class='allTabsArrow']")));
     	driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
     	Thread.sleep(2000);
     	Select viewdropdown = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
	   // List<WebElement> vdd = viewdropdown.getOptions();
	    // System.out.println(vdd.size());
     	Thread.sleep(2000);
     	viewdropdown.selectByVisibleText("maheshtest1");
     	driver.findElement(By.xpath("//span[@class='fFooter']//a[contains(text(),'Edit')]")).click();
     	waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='fname']")));
     	driver.findElement(By.xpath("//input[@id='fname']")).clear();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(System.getProperty("modifyviewname"));
     	Select Fielddropdown = new Select(driver.findElement(By.xpath("//select[@id='fcol1']")));
     	Fielddropdown.selectByVisibleText("Account Name");
     	Thread.sleep(2000);
     	Select Operatordropdown = new Select(driver.findElement(By.xpath("//select[@id='fop1']")));
     	Operatordropdown.selectByVisibleText("contains");
     	Thread.sleep(2000);
           driver.findElement(By.xpath("//input[@id='fval1']")).sendKeys("a");
     	driver.findElement(By.xpath("//body/div/div/table/tbody/tr/td/div/form/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
     	System.out.println("Test case passed");
	}

}
