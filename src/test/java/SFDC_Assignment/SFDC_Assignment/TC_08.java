package SFDC_Assignment.SFDC_Assignment;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class TC_08 extends SfBrowserUtility{

	public static void main(String[] args) throws Exception{
         	SfBrowserUtility.logintoSalesForceBrowser();
         	WebDriver driver = SfBrowserUtility.driver;
         	waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
         	driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
        	waitForPageElementToVisible(driver.findElement(By.xpath("//div[@id='userNav-menuItems']")));
        	driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']")).click();
        	Thread.sleep(4000);
            ArrayList <String> windowTabs = new ArrayList(driver.getWindowHandles());
            System.out.println(windowTabs.size());
            driver.switchTo().window(windowTabs.get(1));
            driver.close();
            Thread.sleep(2000);
            System.out.println("Test Case Passed");
            driver.quit();
    }
}
