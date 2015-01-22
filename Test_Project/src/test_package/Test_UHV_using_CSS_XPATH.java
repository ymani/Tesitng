package test_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Test_UHV_using_CSS_XPATH {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver" , "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait (driver, 20);
		
		driver.manage().window().maximize();
		
		driver.get("http://uhv.edu/");
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[title*='Student Online Center']")));
		WebElement Login = driver.findElement(By.cssSelector("a[title*='Student Online Center']"));
		Login.click();
		
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("UsernameTextBox")));
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("PasswordTextBox")));
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Sign In']")));
		WebElement username = driver.findElement(By.id("UsernameTextBox"));
		WebElement password = driver.findElement(By.id("PasswordTextBox"));
		WebElement Submit = driver.findElement(By.xpath("//input[@value='Sign In']"));
		username.sendKeys("0168944");
		password.sendKeys("Chetared_10");
		Submit.click();
		wait.until (ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign Out")));
		driver.findElement(By.linkText("Sign Out")).click();
		//driver.quit();
	}

	}
