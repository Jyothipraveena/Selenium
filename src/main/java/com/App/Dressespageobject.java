package com.App;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Dressespageobject extends BasePage{
	
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dresses;

	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[1]/label")
	private WebElement smallsize;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[2]/label")
	private WebElement mediumsize;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[3]/label")
	private WebElement largesize;
	
	@FindBy(xpath="//*[@class='heading-counter']")
	private WebElement txtproductheader;
	
	@FindBys(@FindBy(xpath="//*[@class='product_list grid row']"))
	private List<WebElement>firstproduct; 
	
	@FindBys(@FindBy(xpath="//*[@class='product-image-container']"))
	private List<WebElement>allproducts;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	private WebElement addtocart;
	
	@FindBy(xpath="//*[@class='clearfix']/div/h2/i")
	private WebElement productimage;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement producttitle;
	
	@FindBy(xpath="//*[@id='list']//i[@class='icon-th-list']")
	private WebElement list;
	
	@FindBys(@FindBy(xpath="//*[@class='product-container']//h5/a[@class='product-name']"))
	private List<WebElement> productlst;
	
	
	public Dressespageobject() {
		PageFactory.initElements(driver, this);
	}
	public void clickDressestab() {
		Dresses.click();
	}
	public WebElement getsmallsize() {
		return smallsize;
	}
	public WebElement getmediumsize() {
		return mediumsize;
	}
	public WebElement getlargesize() {
		return largesize;
	}
	
	public int getproductnumberfromheader()
	{
		/*
		String text=txtproductheader.getText();
		String[]arr=text.split("");
		String textnumber=arr[2];
		int number=Integer.parseInt(textnumber);
		return number;
		*/
		return Integer.parseInt(txtproductheader.getText().split(" ")[2]);
		
	}
	public int getproductscount() {
	return allproducts.size();
	}
	
	public void clickaddtocart()
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(producttitle).build().perform();
		addtocart.click();
	}
	
	public String productimage() {
		return productimage.getText();
	}
	
	public void clicklist() {
		list.click();
	}
	
		public List<WebElement> getProducts(){
		return productlst;
	}
	
	public boolean discount(WebElement parent)
	{
		return elementFound(parent.findElement(By.xpath(".//*[@class='discount']")));
	}
	public boolean oldprice(WebElement parent) {
		return elementFound(parent.findElement(By.xpath(".//*[@class='old-price product-price']")));
	}

}
