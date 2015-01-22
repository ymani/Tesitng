package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_StreamConnect_2 {
	public static void main(String[] args)
	{
				
		System.setProperty("webdriver.chrome.driver" , "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        System.setProperty("webdriver.ie.driver" , "C:\\Program Files (x86)\\Internet Explorer\\IEDriverServer_32.exe");
        System.setProperty("webdriver.ie.driver" , "C:\\Program Files (x86)\\Internet Explorer\\IEDriverServer_64.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new InternetExplorerDriver();
        //WebDriver driver = new SafariDriver();
		
		WebDriverWait wait = new WebDriverWait (driver, 40);
	
		//driver.manage().window().setSize(new Dimension(1280, 1024));
		
		//driver.manage().window().maximize();
		
		driver.get("http://172.28.182.60/Account/Presentation/Login.aspx?ReturnUrl=/core/presentation/schome.aspx");
		
		
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']")));
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']")));
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$LoginButton']")));
		
		WebElement username = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']"));
		WebElement Submit = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$LoginButton']"));
		
		username.sendKeys("demouser");
		password.sendKeys("Ksis1234");
		Submit.click();
		
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@title='User Settings']")));
		
		WebElement User_Settings = driver.findElement(By.xpath("//input[@title='User Settings']"));
		User_Settings.click();
		
		driver.findElement(By.id("ContentPlaceHolder1_MainContentNest_MainContent_lblUserManagementTab2")).click();
		
		
		
		// check conditions for the toggle of switch Auto Push to PACS
		
			
		if (driver.findElement(By.id("ContentPlaceHolder1_MainContentNest_MainContent_ibUserSetsPacs")).getAttribute("src").contains("on"))
			
		{
		//driver.findElement(By.id("ContentPlaceHolder1_MainContentNest_MainContent_ibUserSetsPacs"));
		
		System.out.println("Transaction successful");
		}
		
		else
		{
			System.out.println("Transaction Not successful");
		}
		
	}
}
