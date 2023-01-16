package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {
		
  
  public WebDriver driver;
	public Landingpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

		
	@FindBy(xpath="//input[@class='search-keyword']")
	WebElement search;
	
	@FindBy(xpath="//h4[@class='product-name']")
	WebElement productname;
	
	@FindBy(xpath="//a[.='Top Deals']")
	WebElement topdeals;
	
	@FindBy(xpath="//a[@class='increment']")
	WebElement increment;
	
	@FindBy(xpath="//button[.='ADD TO CART']")
	WebElement addtocart;
	
	@FindBy(xpath="//img[@class=' ']")
	WebElement chekout;
	
	@FindBy(xpath="//button[.='PROCEED TO CHECKOUT']")
	WebElement gotochekout;
	
	
	public void landingpage(String productname) {
		search.sendKeys(productname);
	}
	public String getname() {
		return productname.getText();
	}
	public void gotoofferpage() {
		topdeals.click();
	}
	public void productcount(int count) {
		int i=0;
		while(i<count-1) {
			increment.click();
			i++;
		}
	}
	public void addtocart() {
		addtocart.click();
	}
	public void Gotocheckout() throws InterruptedException {
		chekout.click();
		Thread.sleep(2000);
		gotochekout.click();
		
	}
	
	
}
