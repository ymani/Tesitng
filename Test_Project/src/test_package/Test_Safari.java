package test_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Test_Safari {
	public static void main(String[] args) 
	{
		WebDriver driver = new SafariDriver();
		WebDriverWait wait = new WebDriverWait (driver, 40);
				
		driver.get("http://www.thehindu.com/");
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.linkText("Sport")));
		WebElement element = driver.findElement(By.linkText("Sport"));
		element.click();
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Dhoni")));
		driver.findElement(By.partialLinkText("Dhoni")).click();
	}
}
