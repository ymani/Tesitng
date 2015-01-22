package test_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test_Firefox
{
	public static void main(String[] args)
	{
	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait (driver, 30);
	
	
	driver.get("http://www.thehindu.com/");
	wait.until (ExpectedConditions.visibilityOfElementLocated(By.linkText("Sport")));
	driver.findElement(By.linkText("Sport")).click();
	wait.until (ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Dhoni")));
	driver.findElement(By.partialLinkText("Dhoni")).click();
	}
}

// Test new Git check