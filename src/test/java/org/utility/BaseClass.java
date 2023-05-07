package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static WebElement ele;

	public static void launchTheChromeBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void loadURL(String url) {

		driver.get(url);

	}

	public static void toClick(WebElement ele) {

		ele.click();

	}

	public static void passKeys(WebElement ele, String newValue) {

		ele.sendKeys(newValue);

	}

	public static void quit() {

		driver.quit();

	}

	public static void close_the_Browser() {

		driver.close();

	}

	public static void javascriptclick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
	}

	public static void javascripSendKey(String arguments,WebElement ele ) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(arguments,ele);
	}
	
	public static void javascripAttribute(WebElement ele ) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].getAttribute('valu')",ele);
	}
	

	public static void selectObj(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByValue(value);

	}

	public static void windMax() {

		driver.manage().window().maximize();
	}
	
	public static void impliCitWait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public static String excelReadDateNumericalDatas(String SheetName, int RowNo, int CellNo) throws IOException {

		File f = new File("C:\\Users\\SAI GOUTHAM\\Satch_TestNG_Project\\Excel\\Credentials.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet Particularsheet = w.getSheet(SheetName);

		Row R = Particularsheet.getRow(RowNo);

		Cell c = R.getCell(CellNo);

		int cellType = c.getCellType();

		String Value = "";

		if (cellType == 1) {

			Value = c.getStringCellValue();

		}

		else if (DateUtil.isCellDateFormatted(c)) {

			Date dd = c.getDateCellValue();

			SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
			Value = s.format(dd);

		}

		else {

			double n = c.getNumericCellValue();
			long l = (long) n;
			Value = String.valueOf(l);

		}

		return Value;

	}

	

}
