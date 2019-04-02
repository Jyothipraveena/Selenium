package com.app.tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.App.BasePage;
import com.App.Dressespageobject;
import com.App.HomePageObjects;

public class Dresses {
	Dressespageobject dp;
	BasePage App;
	HomePageObjects hp;

	public Dresses() {
		dp = new Dressespageobject();
		App = new BasePage();
		hp = new HomePageObjects();
	}
 
@Test
	
	public void verifycheckbox() {
		dp.clickDressestab();
		Assert.assertTrue(dp.getsmallsize().isDisplayed());
		Assert.assertTrue(dp.getmediumsize().isDisplayed());
		Assert.assertTrue(dp.getlargesize().isDisplayed());
	}

@Test
	
	public void verifyproductcount() {
		hp.clickDressestab();
		// int actual = dp.getproductnumberfromheader();
		// int expected = dp.getproductscount();
		Assert.assertTrue(dp.getproductnumberfromheader() == dp.getproductscount(), "Failed:count mismatched");
	}
@Test
	
	public void verifyproductadd()
	{
	dp.clickaddtocart();
	Assert.assertTrue(dp.productimage().equals("Product successfully added to your shoppingcart"));
	}
@Test
	
public void verifydiscountprice()
{
	dp.clickDressestab();
	dp.clicklist();
	List<WebElement> productlst=dp.getProducts();
			for(WebElement product1 : productlst) {
				if(dp.discount(product1) == true) {
					Assert.assertTrue(dp.oldprice(product1), "old price exists");
				}
			}
}
}