package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.App.BasePage;
import com.App.Dressespageobject;
import com.App.HomePageObjects;
import com.App.Productdetails;

public class ProductdetailsTest {
	Productdetails pd;
	BasePage App;
	HomePageObjects hp;
	Dressespageobject dp;
	
	public ProductdetailsTest()
	{
		pd=new Productdetails();
		hp=new HomePageObjects();
		App=new BasePage();
		dp = new Dressespageobject();
	}
@Test
	public void Productdetails() {
		dp.clickDressestab();
		pd.clickproducttitle();
		String desc=pd.getproductdescription();
		Assert.assertTrue(desc.length() < 250);
	}
@Test
	public void socialsitedisplay() {
	dp.clickDressestab();
	pd.clickproducttitle();
	Assert.assertTrue(pd.elementFound(pd.gettweet()));
	Assert.assertTrue(pd.elementFound(pd.getshare()));
	
}
}
