package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty7.server.AbstractHttpConnection.Output;

public class CaseStudy {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\TCS\\elective 3\\software\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.navigate().to("https://www.edx.org/");
		d.manage().window().maximize();
		d.findElement(By.xpath(".//*[@id='page']/header/div/div/div/div[3]/nav/a[2]")).click();
		d.findElement(By.xpath(".//*[@id='register-email']")).sendKeys("sssdfdg@gmail.com");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='register-name']")).sendKeys("sdi");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='register-username']")).sendKeys("bodsjwdj");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='register-password']")).sendKeys("12345678Sk,");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='register-country']")).sendKeys("India");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='register-gender']")).sendKeys("Female");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='register-year_of_birth']")).sendKeys("1995");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='register-level_of_education']")).sendKeys("Bachelor's degree");
		Thread.sleep(1000);
		//d.findElement(By.xpath(".//*[@id='register-goals']")).sendKeys("Because it is a good organisation");
		d.findElement(By.xpath(".//*[@id='register-honor_code']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='register']/button")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='my-courses']/section/a")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='primary-menu-bar']/nav/ul/li[4]/div/button")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='main-nav-courses']/div/div/ul/li[24]/a")).click();
		Thread.sleep(1000);
		String msg=d.findElement(By.xpath(".//*[@id='block-views-subject-banner-block']/div/div/div")).getText();
		Thread.sleep(1000);
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("F:\\TCS\\elective 3\\software\\CT20161828444_S.Sushmithaimg1.jpg"));
		System.out.println(""+msg);
		File sr=new File("F:\\TCS\\elective 3\\sample1.xlsx");
		FileInputStream fis=new FileInputStream(sr);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheetAt(0);
		ws.getRow(0).createCell(1).setCellValue(msg);
		FileOutputStream fos=new FileOutputStream(sr);
		wb.write(fos);
		fos.close();
		String ms=ws.getRow(0).getCell(1).getStringCellValue();
		System.out.println(""+ms);
	
	
		d.close();
	}

}
