package org.cart;

import java.util.Date;

import org.pojo.Cart_Pojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utility.BaseClass;

public class My_Cart_Page extends BaseClass {

	Cart_Pojo p;

	@BeforeClass
	private void preCond() {
		launchTheChromeBrowser();
	}

	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println(d);

	}

	@Test(dataProvider = "sampleData", dataProviderClass = Datas.class, enabled = true, groups = "smoke")
	private void myCartPage_TestCase_1(String em, String fst, String lst)
			throws InterruptedException {

		loadURL("https://www.satch.com/en/");
		p = new Cart_Pojo();
		javascriptclick(p.getLuglink());
		javascriptclick(p.getCheck());
		javascriptclick(p.getTroublebag());
		javascriptclick(p.getCart());
		javascriptclick(p.getMyCart());
		javascriptclick(p.getProceedCheckOut());
		passKeys(p.getEmail(), em);
		passKeys(p.getFrst(), fst);
		passKeys(p.getLast(), lst);

		javascriptclick(p.getContinueBtn());

	}

	@Test(enabled = false, groups = "smoke")
	private void myCartPage_TestCase_2() {

		loadURL("https://www.satch.com/en/");
		p = new Cart_Pojo();
		javascriptclick(p.getLuglink());
		javascriptclick(p.getCheck());
		javascriptclick(p.getTroublebag());
		javascriptclick(p.getCart());
		javascriptclick(p.getMyCart());
		javascriptclick(p.getProceedCheckOut());
		passKeys(p.getEmail(), "discover@345");
		// selectObj(p.getSalutation(), "Diverse");
		javascriptclick(p.getContinueBtn());

	}

	@Parameters({ "email1", "first", "last" })
	@Test(enabled = false, groups = "sanity")

	private void myCartPage_TestCase_4(String email1, String frst, String lst) throws InterruptedException {

		loadURL("https://www.satch.com/en/");
		p = new Cart_Pojo();
		javascriptclick(p.getLuglink());
		javascriptclick(p.getCheck());
		javascriptclick(p.getTroublebag());
		javascriptclick(p.getCart());
		javascriptclick(p.getMyCart());

		javascriptclick(p.getProceedCheckOut());
		Thread.sleep(3000);
		passKeys(p.getEmail(), email1);
		passKeys(p.getFrst(), frst);
		passKeys(p.getLast(), lst);

		// selectObj(p.getSalutation(), "Diverse");
		javascriptclick(p.getContinueBtn());
		System.out.println(Thread.currentThread().getId());

	}

	@Test(priority = -1, enabled = false, groups = "sanity")
	private void myCartPage_TestCase_7() {

		loadURL("https://www.satch.com/en/");
		p = new Cart_Pojo();
		javascriptclick(p.getLuglink());
		javascriptclick(p.getCheck());
		javascriptclick(p.getTroublebag());
		javascriptclick(p.getCart());
		javascriptclick(p.getMyCart());
		javascriptclick(p.getProceedCheckOut());
		passKeys(p.getEmail(), "discover@345");
		// selectObj(p.getSalutation(), "Diverse");
		javascriptclick(p.getContinueBtn());
		System.out.println(Thread.currentThread().getId());

	}

	@Test(priority = -10, enabled = false)
	private void myCartPage_TestCase_10() {

		loadURL("https://www.satch.com/en/");
		p = new Cart_Pojo();
		javascriptclick(p.getLuglink());
		javascriptclick(p.getCheck());
		javascriptclick(p.getTroublebag());
		javascriptclick(p.getCart());
		javascriptclick(p.getMyCart());
		javascriptclick(p.getProceedCheckOut());
		passKeys(p.getEmail(), "discover@345");
		// selectObj(p.getSalutation(), "Diverse");
		javascriptclick(p.getContinueBtn());

	}

	@Test
	private void myCartPage_TestCase_90() {

		loadURL("https://www.flipkart.com/checkout/init?view=FLIPKART&loginFlow=true");
		String title = driver.getTitle();
		System.out.println(title);
		
	}

	@AfterMethod
	private void endDate() {
		Date d = new Date();
		System.out.println(d);

	}

	@AfterClass
	private void postCond() {
		close_the_Browser();

	}

}
