package org.cart;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Links {
	
	
	/*@Test
	private void broken_links() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.satch.com/en/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links count"+links.size());
		

	}*/
	
	
	@Test
	private void brokenLinks_2() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Broken Links
		//1. to find no.of links in a page
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		//2. no of links
		System.out.println("no of links :" + alllinks.size());
		for (WebElement x : alllinks) {
		//3. to fetch link as a string
		String url = x.getAttribute("href");
		//4. url class
		URL u = new URL(url);
		//5. create the connection
		URLConnection con = u.openConnection();
		//6. HttpURLconnection (downcast with url)
		//httpurlconnection--abstract class
		HttpURLConnection hp = (HttpURLConnection)con;
		 //7. getresponse code
		 int responsecode = hp.getResponseCode();
		 if(responsecode !=200) {
		 System.out.println(url + "----->"+ responsecode);
		 }
		 
		 }

		 }
		 
		 
		 
		 
		 
		 
 }
