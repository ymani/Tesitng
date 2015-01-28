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
import org.testng.annotations.Test;


public class Test_StreamConnect_Logout_2 {
	
	@Test
	public void Logout2()
	{
				
		System.setProperty("webdriver.chrome.driver" , "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        System.setProperty("webdriver.ie.driver" , "C:\\Program Files (x86)\\Internet Explorer\\IEDriverServer_32.exe");
       // System.setProperty("webdriver.ie.driver" , "C:\\Program Files (x86)\\Internet Explorer\\IEDriverServer_64.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new InternetExplorerDriver();
        //WebDriver driver = new SafariDriver();
		
		WebDriverWait wait = new WebDriverWait (driver, 40);
	
		driver.get("http://172.28.182.100/Account/Presentation/Login.aspx?ReturnUrl=/core/presentation/schome.aspx");
		
		
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']")));
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']")));
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$LoginButton']")));
		
		WebElement username = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']"));
		WebElement Submit = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$LoginButton']"));
		
		username.sendKeys("demouser");
		password.sendKeys("Ksis1234");
		Submit.click();
		
		
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_MainContentNest_MainContent_hlkVOD")));
		driver.findElement(By.id("ContentPlaceHolder1_MainContentNest_MainContent_hlkVOD")).click();
		
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_ibtnAdmin")));
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_ibtnUser")));
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_ibtnHelp")));
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_ibtnLogOut")));
		
		driver.findElement(By.id("ContentPlaceHolder1_ibtnLogOut")).click();
	
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']")));
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']")));
			
		if ((driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']")).getAttribute("id").equals("ContentPlaceHolder1_LoginUser_UserName"))
			&& 
			(driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']")).getAttribute("id").equals("ContentPlaceHolder1_LoginUser_Password")))
		{
				
		System.out.println("Logout successful");
		}
		
		else
		{
			System.out.println("Logout Not successful");
		}
		
	}
}
