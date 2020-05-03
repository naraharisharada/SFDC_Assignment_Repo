package SFDC_Assignment.SFDC_Assignment;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {
	public static void main(String[] args) throws Exception {
		
		 WebDriver driver = null;
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharada\\Downloads\\chromedriver_win32_2020\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.salesforce.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
			String s1path= "C:\\Users\\Sharada\\eclipse-workspace\\SFDC_Assignment\\salesforcetestdata.properties";
			try {
			Properties prop = new Properties();
			FileInputStream fi = new FileInputStream(s1path);
			prop.load(fi);
			System.getProperties().putAll(prop);
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(System.getProperty("username"));
			}catch (Exception e) {
				
			}
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			Thread.sleep(2000);
			//driver.close();
			driver.quit();
	}
}
