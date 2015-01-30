package test_package;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;


public class Test_StreamConnect_Logout_8 {
	
	@Test
	public void Logout8()
	{
		    
		System.setProperty("webdriver.chrome.driver" , "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
       // System.setProperty("webdriver.ie.driver" , "C:\\Program Files (x86)\\Internet Explorer\\IEDriverServer_32.exe");
       System.setProperty("webdriver.ie.driver" , "C:\\Program Files (x86)\\Internet Explorer\\IEDriverServer_64.exe");
		
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new InternetExplorerDriver();
        //WebDriver driver = new SafariDriver();
		
		WebDriverWait wait = new WebDriverWait (driver, 60);
	
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
		
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_ibtnAdmin")));
		driver.findElement(By.id("ContentPlaceHolder1_ibtnAdmin")).click();
		
		
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_MainContentNest_MainContent_hlkAuth")));
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_MainContentNest_MainContent_hlkAppSett")));
		
		driver.findElement(By.id("ContentPlaceHolder1_MainContentNest_MainContent_hlkAuth")).click();
						
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
				
		System.out.println("Logout of Authentication successful");
	
		}
		
		else
		{
			System.out.println("Logout of Authentication Not successful");
			
		}
		
		// Code for Admin Settings
		
			wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']")));
			wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']")));
			wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$LoginButton']")));
			
			WebElement username1 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']"));
			WebElement password1 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']"));
			WebElement Submit1 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$LoginButton']"));
						
			username1.sendKeys("demouser");
			password1.sendKeys("Ksis1234");
			Submit1.click();
			
			wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_ibtnAdmin")));
			driver.findElement(By.id("ContentPlaceHolder1_ibtnAdmin")).click();
						
			wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_MainContentNest_MainContent_hlkAppSett")));
			driver.findElement(By.id("ContentPlaceHolder1_MainContentNest_MainContent_hlkAppSett")).click();
			
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
					
			System.out.println("Logout of Admin Settings successful");
			
			}
			
			else
			{
				System.out.println("Logout of Admin Settings Not successful");
			
			}
				
			// Code for Manage Streams
			
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']")));
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']")));
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$LoginButton']")));
				
				WebElement username2 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']"));
				WebElement password2 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']"));
				WebElement Submit2 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$LoginButton']"));
							
				username2.sendKeys("demouser");
				password2.sendKeys("Ksis1234");
				Submit2.click();
				
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_ibtnAdmin")));
				driver.findElement(By.id("ContentPlaceHolder1_ibtnAdmin")).click();
							
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_MainContentNest_MainContent_hladdstr")));
				driver.findElement(By.id("ContentPlaceHolder1_MainContentNest_MainContent_hladdstr")).click();
				
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
						
				System.out.println("Logout of Manage Streams successful");
				
				}
				
				else
				{
					System.out.println("Logout of Manage Streams Not successful");
				
				}				
				
				// Code for User Logs
				
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']")));
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']")));
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$LoginButton']")));
				
				WebElement username3 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']"));
				WebElement password3 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']"));
				WebElement Submit3 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$LoginButton']"));
							
				username3.sendKeys("demouser");
				password3.sendKeys("Ksis1234");
				Submit3.click();
				
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_ibtnAdmin")));
				driver.findElement(By.id("ContentPlaceHolder1_ibtnAdmin")).click();
							
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_MainContentNest_MainContent_hluserlog")));
				driver.findElement(By.id("ContentPlaceHolder1_MainContentNest_MainContent_hluserlog")).click();
				
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
						
				System.out.println("Logout of User Logs successful");
				
				}
				
				else
				{
					System.out.println("Logout of User Logs Not successful");
				
				}		
				
				// Code for Archiving Management
				
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']")));
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']")));
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$LoginButton']")));
				
				WebElement username4 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']"));
				WebElement password4 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']"));
				WebElement Submit4 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$LoginButton']"));
							
				username4.sendKeys("demouser");
				password4.sendKeys("Ksis1234");
				Submit4.click();
				
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_ibtnAdmin")));
				driver.findElement(By.id("ContentPlaceHolder1_ibtnAdmin")).click();
							
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_MainContentNest_MainContent_hlMngStreams")));
				driver.findElement(By.id("ContentPlaceHolder1_MainContentNest_MainContent_hlMngStreams")).click();
				
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
						
				System.out.println("Logout of Archiving Management successful");
				
				}
				
				else
				{
					System.out.println("Logout of Archiving Management Not successful");
				
				}				
				
				// Code for Archiving Management
				
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']")));
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']")));
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$LoginButton']")));
				
				WebElement username5 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']"));
				WebElement password5 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']"));
				WebElement Submit5 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$LoginButton']"));
							
				username5.sendKeys("demouser");
				password5.sendKeys("Ksis1234");
				Submit5.click();
				
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_ibtnAdmin")));
				driver.findElement(By.id("ContentPlaceHolder1_ibtnAdmin")).click();
							
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_MainContentNest_MainContent_hlEmr")));
				driver.findElement(By.id("ContentPlaceHolder1_MainContentNest_MainContent_hlEmr")).click();
				
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
						
				System.out.println("Logout of EHR Settings successful");
				
				}
				
				else
				{
					System.out.println("Logout of EHR Settings Not successful");
				
				}				
				// DICOM Settings
				
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']")));
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']")));
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$LoginButton']")));
				
				WebElement username6 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']"));
				WebElement password6 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']"));
				WebElement Submit6 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$LoginButton']"));
							
				username6.sendKeys("demouser");
				password6.sendKeys("Ksis1234");
				Submit6.click();
				
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_ibtnAdmin")));
				driver.findElement(By.id("ContentPlaceHolder1_ibtnAdmin")).click();
							
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_MainContentNest_MainContent_hlEmr0")));
				driver.findElement(By.id("ContentPlaceHolder1_MainContentNest_MainContent_hlEmr0")).click();
				
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
						
				System.out.println("Logout of DICOM Settings successful");
				
				}
				
				else
				{
					System.out.println("Logout of DICOM Settings Not successful");
				
				}			
				
				// Manage Codecs
				
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']")));
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']")));
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$LoginButton']")));
				
				WebElement username7 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$UserName']"));
				WebElement password7 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$Password']"));
				WebElement Submit7 = driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$LoginUser$LoginButton']"));
							
				username7.sendKeys("demouser");
				password7.sendKeys("Ksis1234");
				Submit7.click();
				
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_ibtnAdmin")));
				driver.findElement(By.id("ContentPlaceHolder1_ibtnAdmin")).click();
							
				wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("ContentPlaceHolder1_MainContentNest_MainContent_HyperLink1")));
				driver.findElement(By.id("ContentPlaceHolder1_MainContentNest_MainContent_HyperLink1")).click();
				
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
						
				System.out.println("Logout of Manage Codecs successful");
				
				}
				
				else
				{
					System.out.println("Logout of Manage Codecs Not successful");
				
				}						
					
				
				
	}
}
