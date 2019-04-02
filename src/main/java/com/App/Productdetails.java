package com.App;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productdetails extends BasePage {

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/*[text()='Dresses']")
	private WebElement Dresses;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement producttitle;
	
	@FindBy(xpath="//*[@class='primary_block row']//*[@class='icon-twitter']")
	private WebElement twitter;
	
	@FindBy(xpath="//*[@class='primary_block row']//*[@class='icon-facebook']")
	private WebElement share;
	
	@FindBy(xpath="//*[@class='primary_block row']//*[@id='short_description_content']//p")
	private WebElement productdescription;
	
	@FindBy(xpath="//*[@class='fancybox-item fancybox-close']")
	private WebElement close;

	public Productdetails() {
	PageFactory.initElements(driver, this);
	}
	public void clickDressestab() {
		Dresses.click();
	}
	public void clickproducttitle() {
		producttitle.click();
	}
	public WebElement gettweet()
	{
		return twitter;
	}
	
	public WebElement getshare() {
		return share;
	}
	public String getproductdescription() {
		return productdescription.getText();
	}
	public WebElement getclose() {
		
	}
}
