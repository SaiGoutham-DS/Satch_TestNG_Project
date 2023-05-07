package org.cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.Cart_Pojo;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.utility.BaseClass;

public class Cart_Function extends BaseClass {

	Cart_Pojo p;

//	@BeforeClass
//	private void preCondition() {
//		launchTheChromeBrowser();
//
//	}

	@Test(enabled = false)

	public void cart_TestCase_1() {
		
		launchTheChromeBrowser();
		loadURL("https://www.satch.com/en/");
		WebElement tex = driver.findElement(By.xpath("//h1[text()='Your satch, your style!']"));
		String text = tex.getText();

		Assert.assertEquals("Your satch, your style!", text, "check");
		p = new Cart_Pojo();
		javascriptclick(p.getLuglink());

		System.out.println("sai");
		System.out.println("moni");
		System.out.println("roshini");
		javascriptclick(p.getCheck());
		// javascriptclick(p.getGeo());
		// javascriptclick(p.getCart());
		quit();
		//

	}

	@Test(enabled = true)
	public void cart_TestCase_3() {
		
		launchTheChromeBrowser();
		loadURL("https://www.satch.com/en/");
		p = new Cart_Pojo();
		javascriptclick(p.getLuglink());
		javascriptclick(p.getCheck());
		javascriptclick(p.getGeo());
		javascriptclick(p.getCart());
		quit();

	}

	@Test(enabled = true)
	public void cart_TestCase_2() {
		
		launchTheChromeBrowser();
		impliCitWait(10);
		loadURL("https://www.satch.com/en/");
		p = new Cart_Pojo();
		javascriptclick(p.getLuglink());
		javascriptclick(p.getCheck());
		javascriptclick(p.getGeo());
		javascriptclick(p.getCart());
		quit();

	}

	@Test
	public void cart_TestCase_5() {
		
		launchTheChromeBrowser();
		loadURL("https://www.satch.com/en/");
		p = new Cart_Pojo();
		javascriptclick(p.getLuglink());
		javascriptclick(p.getCheck());
		javascriptclick(p.getGeo());
		javascriptclick(p.getCart());
		quit();

	}

	@Test
	public void cart_TestCase_4() {
		
		launchTheChromeBrowser();
		loadURL("https://www.satch.com/en/");
		p = new Cart_Pojo();
		javascriptclick(p.getLuglink());
		javascriptclick(p.getCheck());
		javascriptclick(p.getGeo());
		javascriptclick(p.getCart());
		quit();
		

	}

//	@AfterClass
//	private void postCond() {
//		quit();
//	}

}
