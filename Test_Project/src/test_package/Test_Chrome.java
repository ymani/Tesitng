package test_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test_Chrome 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver" , "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait (driver, 20);
		
		
		driver.get("http://www.thehindu.com/");
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.linkText("Sport")));
		driver.findElement(By.linkText("Sport")).click();
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Dhoni")));
		driver.findElement(By.partialLinkText("Dhoni")).click();
		
			}
}

//Testing repository