package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pageobject.Pageobjectmanager;

public class BaseTest {
	
	public  WebDriver driver;
	public String sss,s;
	public int j;
	public Pageobjectmanager page;
	public Testbase testbase;
	public Genricutils genricutils;
	public BaseTest() throws IOException {
		testbase=new Testbase(); 
		page=new Pageobjectmanager(testbase.webdriver());
		genricutils=new Genricutils(testbase.webdriver());
		
	}
}
