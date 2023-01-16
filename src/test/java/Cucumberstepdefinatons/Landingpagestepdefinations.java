package Cucumberstepdefinatons;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pageobject.Landingpage;
import Pageobject.Offerspage;
import Utils.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Landingpagestepdefinations {
	
	//public  WebDriver driver;
	//public String s,sss;
	public BaseTest base;
	public Landingpage land;
	public Offerspage offer;
	//public Pageobjectmanager page;

	
	public Landingpagestepdefinations(BaseTest base) {
		   this.base=base;
		}
	
	@Given("User is on greencart landing page")
	public void user_is_on_greencart_landing_page() {
	   
	}
	@When("^User is serach product with short name (.+) and extract the result$")
	public void user_is_serach_product_with_short_name_and_extract_the_result(String string) throws InterruptedException {
		land=base.page.getLandingpage();
		land.landingpage(string);
		Thread.sleep(2000);
		base.s=land.getname();
	    String[] ss=base.s.split("-");
	    base.sss=ss[0].trim();
	    
	}
	
	@When("User is now on offer page")
	public void  User_is_now_on_offer_page() {
		land.gotoofferpage();
	    
	}
	
	@When("Added {string} product of the selected product in cart")
	public void added_product_of_the_selected_product_in_cart(String string) {
		base.j=Integer.parseInt(string);  

		land.productcount(base.j);
		land.addtocart();
	}
	
	
   
}
