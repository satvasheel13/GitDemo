package Pageobject;

import org.openqa.selenium.WebDriver;

public class Pageobjectmanager {
	public Landingpage land;
	public WebDriver driver;
	public Offerspage offer;
	public Checkoutpage check;

	
	public Pageobjectmanager(WebDriver driver) {
		this.driver=driver;
	}
	
	public Landingpage getLandingpage() {
		land=new Landingpage(driver);
		return land;
	}
	
	public Offerspage getOffersgpage() {
		offer=new Offerspage(driver);
		return offer;
	}
	public Checkoutpage getCheckoutpage() {
		check=new Checkoutpage(driver);
		return check;
	}
	
	
}
