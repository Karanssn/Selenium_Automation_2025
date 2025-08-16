package com.flipkart.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.packages.baseclass.BaseClass;

public class BookingPage extends BaseClass {
	public  BookingPage() {
		PageFactory.initElements(driver, this);
	}
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
	

}
	


