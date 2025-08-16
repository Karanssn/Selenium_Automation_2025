package com.flipkart.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.packages.baseclass.BaseClass;

public class Loginpage extends BaseClass{


	//	public static String username = "user-name"; //id
//	public static String pwd = "password"; //id
//	public static String loginBtn = "//input[@value=\"LOGIN\"]";//xpath
//	
	// without page factory
//	public  WebElement usName = driver.findElement(By.id("user-name"));
//	public  WebElement pwd = driver.findElement(By.id("password"));
//	public  WebElement lgb = driver.findElement(By.xpath("\"//input[@value=\\\"LOGIN\\\"]\""));
//	
	// with page factory
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	public WebElement userName;
	
	@FindBy(id="password")
	public WebElement passWord;
	

	@FindBy(id="login")
	 public WebElement login;
	
	@FindBy(xpath="//input[@class=\"input_show\"]")
	  public WebElement AccountHolder1;
	@FindBy(id="location")
	public WebElement loacation;
	
	@FindBy(id="hotels")
	public WebElement hotels;
	

	@FindBy(id="room_type")
	 public WebElement roomtype;
	
	@FindBy(id="room_nos")
	 public WebElement roomnos;
	
	@FindBy(name="datepick_in")
	 public WebElement datein;
	
	@FindBy(name="datepick_out")
	 public WebElement dateOut;
	
	@FindBy(name="adult_room")
	 public WebElement adultroom;
	
	@FindBy(name="child_room")
	 public WebElement childroom;
	
	@FindBy(xpath ="//input[@name=\"Submit\"]")
	 public WebElement search;
	
	@FindBy(xpath ="//input[@name=\"radiobutton_0\"]")
	 public WebElement radiobutton;
	
	@FindBy(id="continue")
	 public WebElement Continue;
	
	
	@FindBy(name="first_name")
	 public WebElement fristname;
	
	@FindBy(name="last_name")
	 public WebElement lastname;
	
	@FindBy(xpath ="//textarea[@name=\"address\"]")
	 public WebElement adderess;
	
	@FindBy(name="cc_num")
	 public WebElement cardnumber;
	
	@FindBy(id="cc_type")
	 public WebElement cardtype;
	
	@FindBy(name="cc_exp_month")
	 public WebElement cardexmonth;
	
	@FindBy(name="cc_exp_year")
	 public WebElement cardeyear;
	
	@FindBy(name="cc_cvv")
	 public WebElement cvv;
	
	@FindBy(id="book_now")
	 public WebElement booknow;
	
	@FindBy(xpath= "//input[@name=\"order_no\"]")
	 public WebElement orderid;
	
	@FindBy(xpath= "//div[@class=\"auth_error\"]/b")
	 public WebElement loginerror;
	

}
