package com.App;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/*[text()='Women']")
	private WebElement Women;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/*[text()='Dresses']")
	private WebElement Dresses;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement TShirts;

	@FindBy(xpath = "//*[@id='categories_block_left']/h2")
	private WebElement pageheader;

	@FindBy(xpath = "//*[@class='row']//*[@id='layered_block_left']/p")
	private WebElement tshirtsheader;

	@FindBy(id="newsletter-input")
	private WebElement newsletter;
	
	@FindBy(xpath="//*[@id='newsletter_block_left']/div/form/div/button")
	private WebElement submitbutton;
	
	@FindBy(xpath="//*[@id='columns']//p[@class='alert alert-danger']")
	private WebElement alertDanger;
	
	@FindBy(xpath="//*[@id='columns']//p[@class='alert alert-success']")
	private WebElement alertsuccess;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']//a[text()='S']")
	private WebElement smallsize;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']//a[text()='M']")
	private WebElement mediumsize;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']//a[text()='L']")
	private WebElement largesize;
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return Women;
	}

	public WebElement getDresses() {
		return Dresses;
	}

	public WebElement getTShirts() {
		return TShirts;
	}

	public String getpageheader() {
		return pageheader.getText();
	}

	public String gettshirtsheader() {
		return tshirtsheader.getText();
	}

	public void clickwomentab() {
		Women.click();
	}

	public void clickDressestab() {
		Dresses.click();
	}

	public void clickTShirtstab() {
		TShirts.click();
	}
	public void newslettertab() {
	 newsletter.sendKeys("sri@gmail.com");
	}

	public void submitbutton() {
		submitbutton.click();
	}
	public void clicknewslettertab() {
	newsletter.click();
	}
	public String getnewsalert() {
		return alertsuccess.getText();
	}
	public String getDangeralert() {
		return alertDanger.getText();
	}
}
	
	
	
	


	
	

	