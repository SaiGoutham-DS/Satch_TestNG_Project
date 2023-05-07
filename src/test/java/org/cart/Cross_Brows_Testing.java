package org.cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross_Brows_Testing {
	@Parameters("browser")
	@Test
	private void testCase_1(String browsname) {

		if (browsname.equals("EdgeBrowser")) {

			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.navigate().to("https://www.satch.com/en/");

		} else if (browsname.equals("ChromeBrowser")) {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.satch.com/en/");

		} else {

			WebDriverManager.operadriver().setup();
			WebDriver driver = new OperaDriver();
			driver.navigate().to("https://www.satch.com/en/");
		}

	}
	
	
	@Parameters("browser")
	@Test
	private void testCase_3(String browsname) {

		if (browsname.equals("EdgeBrowser")) {

			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.navigate().to("https://www.satch.com/en/");

		} else if (browsname.equals("ChromeBrowser")) {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.satch.com/en/");

		} else {

			WebDriverManager.operadriver().setup();
			WebDriver driver = new OperaDriver();
			driver.navigate().to("https://www.satch.com/en/");
		}

	}


}
