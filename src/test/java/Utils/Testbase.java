package Utils;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
		
	public WebDriver driver;
	
	public WebDriver webdriver() throws IOException {
		FileReader reader=new FileReader(System.getProperty("user.dir")+"//src//test//resources//Global.properties");
	    Properties props=new Properties();
	    props.load(reader);
	    String browser=props.getProperty("browse");
	    String URL=props.getProperty("url");
	    
		if(driver==null) {
			if(browser.equalsIgnoreCase("chrome")) {
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			}
			if(browser.equalsIgnoreCase("firefox")) {
				 WebDriverManager.firefoxdriver().setup();
				    driver = new FirefoxDriver();

			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(URL);
		}
			return driver;
	}
}
