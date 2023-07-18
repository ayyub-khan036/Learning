package BaseSetup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public WebDriver driver;
	String projectPath=System.getProperty("user.dir");
	public Properties prop;
	
	public WebDriver initialiseDriver() throws IOException {
		FileInputStream fis=new FileInputStream(projectPath+"\\src\\test\\java\\resources\\setup.properties");
		prop=new Properties();
		prop.load(fis);
		String browser =prop.getProperty("Browser");
		System.out.println(browser);
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		
		if (browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		if (browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	@BeforeTest
	public void launchApplication() throws IOException {
		initialiseDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

}
