package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Offerspage {
	public WebDriver driver;
	public Offerspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@id='search-field']")
	WebElement search;
	
	@FindBy(xpath="//tr/td[1]")
	WebElement productname;

	@FindBy(xpath="//a[.='Top Deals']")
	WebElement topdeals;
	
	public void offerpage(String productname) {
		search.sendKeys(productname);
	}
	
	public String getname() {
		return productname.getText();
	}
	
}
