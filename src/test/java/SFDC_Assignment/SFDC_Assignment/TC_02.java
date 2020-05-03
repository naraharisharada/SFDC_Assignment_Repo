package SFDC_Assignment.SFDC_Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.FileInputStream;
import java.util.Properties;

public class TC_02 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharada\\Downloads\\chromedriver_win32_2020\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Login')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		String s1path= "C:\\Users\\Sharada\\eclipse-workspace\\SFDC_Assignment\\salesforcetestdata.properties";
		try {
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream(s1path);
		prop.load(fi);
		System.getProperties().putAll(prop);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(System.getProperty("username"));
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys(System.getProperty("password"));
		}catch (Exception e) {
			
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(5000);
		//driver.close();
		driver.quit();
				
	}
}
