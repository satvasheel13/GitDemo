package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
		
	 public WebDriver driver;
		public Checkoutpage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}

			
		@FindBy(xpath="//tr/td/p[@class='product-name']")
		WebElement pname;
		
		@FindBy(xpath="//input[@class='promoCode']")
		WebElement promocode;
		
		@FindBy(xpath="//button[.='Place Order']")
		WebElement placeorder;
		
		public String getname() {
			return pname.getText();
		}
		public boolean promocodeisdisplay() {
			return promocode.isDisplayed();
		}
		public void placeorder() {
			placeorder.click();
		}
		
		public boolean placeorederisdisplay() {
			
			return placeorder.isDisplayed();
		}
}
