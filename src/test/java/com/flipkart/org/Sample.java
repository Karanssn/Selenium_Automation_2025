package com.flipkart.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.CellType;

import com.packages.baseclass.BaseClass;

public class Sample {
	public static void main(String[] args) throws InterruptedException, IOException {
//		BaseClass.dateAndTime();
//		BaseClass.browserlaunch("https://www.flipkart.com/");
//		BaseClass.Xpath("//input[@name=\"q\"]").sendKeys("mobile");
//		BaseClass.Xpath("//button[@class=\"_2iLD__\"]").click();
//		Thread.sleep(1000);
//		BaseClass.Xpath("(//div[@class=\"KzDlHZ\"])[1]").click();
//		BaseClass.Xpath("//div[@class=\"H6-NpN _3N4_BX\"]").click();
//		BaseClass.Xpath("//input[@class=\"r4vIwl BV+Dqf\"]").sendKeys("9080131671");
//		BaseClass.Xpath("//button[@class=\"QqFHMw twnTnD _7Pd1Fp\"]").click();
//		BaseClass.implicitWait();
//		BaseClass.Xpath("(//input[@class='r4vIwl IX3CMV'])[1]").sendKeys("8");
//		BaseClass.Xpath("(//input[@class='r4vIwl IX3CMV'])[2]").sendKeys("5");
//		BaseClass.Xpath("(//input[@class='r4vIwl IX3CMV'])[3]").sendKeys("6");
//		BaseClass.Xpath("(//input[@class='r4vIwl IX3CMV'])[4]").sendKeys("7");
//		BaseClass.Xpath("(//input[@class='r4vIwl IX3CMV'])[5]").sendKeys("1");
//		BaseClass.Xpath("(//input[@class='r4vIwl IX3CMV'])[6]").sendKeys("7");
//		BaseClass.Xpath("//button[@class=\"QqFHMw llMuju M5XAsp\"]").click();	
//		BaseClass.quit();
//		BaseClass.dateAndTime();
		ArrayList<String> teamMembers = new ArrayList<>();
		teamMembers.add("ramesh");
		teamMembers.add("samesh");
		teamMembers.add("famesh");
		teamMembers.add("tamesh");
		for (int i=0; i<teamMembers.size();i++ ) {
		File file = new File("C:\\Users\\karan\\OneDrive\\Desktop\\Book1.xlsx");
		FileInputStream InputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(InputStream);
		Sheet sheet = workbook.getSheet("Sheet2");
		Row row = sheet.createRow(i);
		Cell cell = row.createCell(0);
		System.out.println(cell);
		cell.setCellValue(teamMembers.get(i));
		System.out.println(cell);
		FileOutputStream fileo= new FileOutputStream(file);
		workbook.write(fileo);
		workbook.close();
			
		
		}
		
//		for (int i = 0; i <= sheet.getPhysicalNumberOfRows(); i++) {
//			Row row = sheet.getRow(i);
//			if (row == null) continue;
//			for (int j = 0; j <= row.getPhysicalNumberOfCells(); j++) {
//				Cell cell = row.getCell(j);
//				if (cell == null) continue;
//				if (cell.getCellType() == CellType.STRING) {
//					String Stringcell = cell.getStringCellValue();
//					System.out.println(Stringcell);
//				} else if (cell.getCellType() == CellType.NUMERIC) {
//					if(DateUtil.isCellDateFormatted(cell)) {
//						Date dateformat =cell.getDateCellValue();
//						SimpleDateFormat DF= new SimpleDateFormat("dd-MMM-yyyy");
//						String format = DF.format(dateformat);
//						System.out.println(format);
//						
//					}else {
//					double numericCellValue = cell.getNumericCellValue();
//					int numberValue = (int) numericCellValue;
//					System.out.println(numberValue);
//					}
//				}
//
//			}
//		

		}
	
//		File file1 = new File("C:\\Users\\karan\\eclipse-workspace\\WebAutomation\\src\\test\\resources\\TestData\\TestData.Properties");
//		FileInputStream InputStream1 = new FileInputStream(file1);
//		Properties property = new Properties();
//		property.load(InputStream1);
//	
//		
//	}

}
