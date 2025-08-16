package com.flipkart.pageexeccution;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.flipkart.Ilistner.Listner;
import com.flipkart.pagefactory.Loginpage;
import com.packages.baseclass.BaseClass;


public class LoginPageExecution extends Loginpage {
	
	private static Logger log = LogManager.getLogger(LoginPageExecution.class);
	public static ExtentHtmlReporter htmlReporter ;
	public static ExtentReports extent ;

	
	@BeforeClass(alwaysRun = true ,groups = {"Regression","Smoke"})
	public  static void browserlaunch() {
		BaseClass.browserlaunch("https://adactinhotelapp.com/index.php");
		}
	
	@AfterClass(alwaysRun = true ,groups =  {"Regression","Smoke"})
	public static void browserquir() {
		BaseClass.quit();
		extent.flush();
	}
	
	
	@Test(priority = 1,groups = {"Regression","Smoke"})
	public void loginwithvalidcrendential() {
		htmlReporter =  new ExtentHtmlReporter("reports/extent-report.html");
		extent.attachReporter(htmlReporter);
		driver.get("https://adactinhotelapp.com/index.php");
		log.info("launching the browser");
		ExtentTest test1= extent.createTest("Valid login");
		test1.info("launched");
		Loginpage lp = new Loginpage();
		lp.userName.sendKeys("KaranDuraisamy");
		lp.passWord.sendKeys("Karan@3108");
		lp.login.click();
		String st =lp.AccountHolder1.getAttribute("value");
		
		String sub =	st.substring(6, 20)	;
		System.out.println(sub);
		log.info("Account login successful");
	
		// Validation 
		String AccountName = "KaranDuraisamy";
		Assert.assertTrue(AccountName.equals(sub));
	}

	@Test(priority = 2,groups = {"Regression","Smoke"})
	public void loginwithInvalidcrendential() {
		driver.get("https://adactinhotelapp.com/index.php");
		log.info("launching the browser");
		Loginpage lp = new Loginpage();
		lp.userName.sendKeys("KaranDuraisamy");
		lp.passWord.sendKeys("Karan@31608");
		lp.login.click();
		Assert.assertTrue(lp.loginerror.isDisplayed());
		log.info("Account login is unsuccessful");
	
		// Validation 
		
	}
	
	
	@Test(priority = 3,groups = {"Regression","Smoke"})
	public void bookingSingleRoom() throws IOException {
		driver.get("https://adactinhotelapp.com/index.php");
		Loginpage lp = new Loginpage();
		lp.userName.sendKeys("KaranDuraisamy");
		lp.passWord.sendKeys("Karan@3108");
		lp.login.click();
		String st =lp.AccountHolder1.getAttribute("value");
		WebElement select =lp.loacation;
		Select drop = new Select(select);
		drop.selectByIndex(2);
		WebElement select1 =lp.hotels;
		Select drop1 = new Select(select1);
		drop1.selectByIndex(1);
		WebElement select2 =lp.roomtype;
		Select drop2 = new Select(select2);
		drop2.selectByIndex(1);
		WebElement select3 =lp.roomnos;
		Select drop3 = new Select(select3);
		drop3.selectByIndex(1);
		lp.datein.sendKeys("27/07/2025");
		lp.dateOut.sendKeys("28/07/2025");
		WebElement select4 =lp.adultroom;
		Select drop4 = new Select(select4);
		drop4.selectByIndex(1);
		WebElement select5 =lp.childroom;
		Select drop5 = new Select(select5);
		drop5.selectByIndex(1);
		lp.search.click();
		lp.radiobutton.click();
		lp.Continue.click();
		lp.fristname.sendKeys("karan");
		lp.lastname.sendKeys("durai");
		lp.adderess.sendKeys("mainstreet");
		lp.cardnumber.sendKeys("1234567890123456");
		WebElement select9 =lp.cardtype;
		Select drop9 = new Select(select9);
		drop9.selectByIndex(4);
		WebElement select10 =lp.cardexmonth;
		Select drop10 = new Select(select10);
		drop10.selectByIndex(4);
		WebElement select11 =lp.cardeyear;
		Select drop11 = new Select(select11);
		drop11.selectByIndex(17);
		lp.cvv.sendKeys("123");
		lp.booknow.click();
		BaseClass.implicitWait();
		String str=lp.orderid.getAttribute("value");
		System.out.println(str);
	
//		File file1 = new File("C:\\Users\\karan\\OneDrive\\Desktop\\Book1.xlsx");
//		FileInputStream fis = new FileInputStream(file1);
//		Workbook wk = new XSSFWorkbook(fis);
//		
//		Sheet sheet = wk.createSheet("Demo1");
//		Row row = sheet.createRow(1);
//		Cell cell = row.createCell(1);			
//		cell.setCellValue(str);
//		
//		FileOutputStream fos = new FileOutputStream(file1);
//		wk.write(fos);
//		wk.close();
//		
//		System.out.println("Completed!");
		
	}
	@Test(priority = 4,groups = {"Regression"})
	public void bookingFamilyRoom() throws IOException {
		
		Loginpage lp = new Loginpage();
		lp.userName.sendKeys("KaranDuraisamy");
		lp.passWord.sendKeys("Karan@3108");
		lp.login.click();
		String st =lp.AccountHolder1.getAttribute("value");
		WebElement select =lp.loacation;
		Select drop = new Select(select);
		drop.selectByIndex(2);
		WebElement select1 =lp.hotels;
		Select drop1 = new Select(select1);
		drop1.selectByIndex(1);
		WebElement select2 =lp.roomtype;	
		Select drop2 = new Select(select2);
		drop2.selectByIndex(4);
		WebElement select3 =lp.roomnos;
		Select drop3 = new Select(select3);
		drop3.selectByIndex(4);
		lp.datein.sendKeys("27/07/2025");
		lp.dateOut.sendKeys("28/07/2025");
		WebElement select4 =lp.adultroom;
		Select drop4 = new Select(select4);
		drop4.selectByIndex(1);
		WebElement select5 =lp.childroom;
		Select drop5 = new Select(select5);
		drop5.selectByIndex(1);
		lp.search.click();
		BaseClass.implicitWait();
		lp.radiobutton.click();
		lp.Continue.click();
		lp.fristname.sendKeys("karan");
		lp.lastname.sendKeys("durai");
		lp.adderess.sendKeys("mainstreet");
		lp.cardnumber.sendKeys("1234567890123456");
		WebElement select9 =lp.cardtype;
		Select drop9 = new Select(select9);
		drop9.selectByIndex(4);
		WebElement select10 =lp.cardexmonth;
		Select drop10 = new Select(select10);
		drop10.selectByIndex(4);
		WebElement select11 =lp.cardeyear;
		Select drop11 = new Select(select11);
		drop11.selectByIndex(17);
		lp.cvv.sendKeys("123");
		lp.booknow.click();
		BaseClass.implicitWait();
		String str=lp.orderid.getAttribute("value");
		System.out.println(str);
		
		}
		
	}


