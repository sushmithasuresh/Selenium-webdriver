package com;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excellaunch {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		String fp="F:\\TCS\\elective 3\\sample.xlsx";
		FileInputStream fs=new FileInputStream(fp);
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sh=wb.getSheetAt(0);
		String q=sh.getRow(1).getCell(2).getStringCellValue();
		System.out.println(q);
		String b=sh.getRow(1).getCell(3).getStringCellValue();
		 System.setProperty("webdriver.chrome.driver", "F:\\TCS\\elective 3\\software\\chromedriver.exe");
		 if(b=="ChromeDriver")
			 {
			 WebDriver driver=new ChromeDriver();
			 
		 driver.get(q);
		 driver.manage().window().maximize();

		 driver.close();
			 }
	}

}
