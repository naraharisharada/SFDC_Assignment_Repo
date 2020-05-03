package SFDC_Assignment.SFDC_Assignment;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_06 {

	public static void main(String[] args) throws Exception{
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
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys(System.getProperty("password"));
		}catch (Exception e) {
			
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@id='userNavLabel']"))));
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"))));
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"))));
		driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")).click();
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		//System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Email')]")).getText());
		driver.findElement(By.xpath("//input[@id='lastName']")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(System.getProperty("lastname"));
        driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body")).sendKeys(System.getProperty("posttext"));
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		driver.findElement(By.xpath("//a[@id='publisherAttachContentPost']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']")).click();
		
		driver.findElement(By.xpath("//input[@id='chatterFile']")).sendKeys(System.getProperty("fileupload"));
		
		
		
	    driver.findElement(By.id("publishersharebutton")).click();
		
		}

}
