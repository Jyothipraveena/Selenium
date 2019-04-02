package com.app.tests;

import com.App.BasePage;
import com.App.HomePageObjects;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {
	HomePageObjects homepage;
	BasePage App;
	
	public HomePageTest()
	{
		homepage=new HomePageObjects();
		App=new BasePage();
	}
	@Test
	public void Verifytest1()
	{
	 Assert.assertTrue(homepage.getWomen().isDisplayed());
	 Assert.assertTrue(homepage.getDresses().isDisplayed());
	 Assert.assertTrue(homepage.getTShirts().isDisplayed());
	 
	
	}
	@Test
	public void Verifytest2()
	{
		homepage.clickwomentab();
		Assert.assertTrue(homepage.getpageheader().equals("WOMEN"));
		homepage.clickDressestab();
		Assert.assertTrue(homepage.getpageheader().equals("DRESSES"));
		homepage.clickTShirtstab();
		Assert.assertTrue(homepage.gettshirtsheader().equals("CATALOG"));
}
	@Test
	public void newslettertab() {
		homepage.clicknewslettertab();
		homepage.newslettertab();
		homepage.submitbutton();
		System.out.println(homepage.getnewsalert().equals(" Newsletter : You have successfully subscribed to this newsletter."));
		
}
}
