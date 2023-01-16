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

public class Offerpagestepdefinations {
	
	public String s1;
	public BaseTest base;
	public Offerspage offer;
	public Landingpage land;


	public Offerpagestepdefinations(BaseTest base) {
		   this.base=base;
		}
	
	@Then("^User is searach same product on offer page (.+) extract the result$")
	public void user_is_searach_same_product_on_offer_page_and_extract_the_result(String string1) {
		offer=base.page.getOffersgpage();

		switchwindows();
	    offer.offerpage(string1);
	    s1=offer.getname();
	}
	
	public void switchwindows() {
		 
		   base.genricutils.swithchwindowtochild();
	}
	
	@Then("User is validit both the results")
	public void user_is_validit_both_the_results() {
	   System.out.println(base.sss);
	   System.out.println(s1);
	   try {
		Assert.assertEquals(s1, base.sss,"test is fail");
	   }
	   finally{
		if(base.s==s1) {
	    	System.out.println("Test is pass");
	    }
	    else{
	    	System.out.println("Test is fail");
	    }
		
	   }
		
	}
   
}
