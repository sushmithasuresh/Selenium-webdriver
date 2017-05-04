package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class seleniumhq {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\TCS\\elective 3\\software\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.navigate().to("http://www.seleniumhq.org/");
		d.manage().window().maximize();
		d.findElement(By.xpath(".//*[@id='sidebar']/div[2]/form/input[3]")).click();
        Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='gif_continue']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='amount']")).sendKeys("5000");
		Thread.sleep(1000);
		d.findElement(By.id("enable_recurring_donations")).click();
		Thread.sleep(1000);
		d.findElement(By.id("country_code")).sendKeys("India");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='first_name']")).sendKeys("sms");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='last_name']")).sendKeys("S");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='cc_number']")).sendKeys("266146");
		Thread.sleep(1000);
		d.findElement(By.id("review")).click();
		Thread.sleep(1000);
		d.close();
		

	}

}
