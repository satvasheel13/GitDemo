package Utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Genricutils {
    public WebDriver driver;
	public Genricutils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void swithchwindowtochild() {
		 Set<String>s=driver.getWindowHandles();
		    Iterator<String> I1= s.iterator();
		    String parent=I1.next();
		    String child=I1.next();
		    driver.switchTo().window(child);
	}
	
	public Properties getpropratiesfile() throws IOException {
		FileReader reader=new FileReader(System.getProperty("user.dir")+"//src//test//resources//Global.properties");
        Properties props=new Properties();
        props.load(reader);
        return props;
	}
}
