package Cucumberstepdefinatons;

import org.testng.Assert;

import Pageobject.Checkoutpage;
import Pageobject.Landingpage;
import Pageobject.Offerspage;
import Utils.BaseTest;
import io.cucumber.java.en.Then;

public class Checkoutpagestepdefinations {
	
	public BaseTest base;
	public Landingpage land;
	public Offerspage offer;
	public Checkoutpage check;

	

	
	public Checkoutpagestepdefinations(BaseTest base) {
		   this.base=base;
		}
	@Then("^User is proceeds to the cheack validate the productname (.+) in the checkout page$")
	public void user_is_proceeds_to_the_cheack_validate_the_productname_in_the_checkout_page(String string) throws InterruptedException {
	    land=base.page.getLandingpage();
	    land.Gotocheckout();
	    check=base.page.getCheckoutpage();
	    String cartproductname=check.getname();
	    String[] cartproductnamearray=cartproductname.split("-");
	    String actualname=cartproductnamearray[0].trim();
	    System.out.println(string);
		   System.out.println(actualname);
		   try {
			Assert.assertEquals(string, actualname,"test is fail");
		   }
		   finally{
			if(actualname.contains(string)) {
		    	System.out.println("Test is pass");
		    }
		    else{
		    	System.out.println("Test is fail");
		    }
			
		   }
	    
	}
	
	@Then("User is able to see promo code and place the order")
	public void user_is_able_to_see_promo_code_and_place_the_order() {
	    boolean b=check.promocodeisdisplay();

	    boolean c=check.placeorederisdisplay();
	    System.out.println(b);
	    System.out.println(c);
	    check.placeorder();
	    

	}
	
}
