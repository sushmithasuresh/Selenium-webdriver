package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class samplechild {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\TCS\\elective 3\\software\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.navigate().to("http://sample.websitesforchildcare.com.au/");
		d.manage().window().maximize();
		d.findElement(By.xpath(".//*[@id='email']")).sendKeys("Parent");
		d.findElement(By.xpath(".//*[@id='password']")).sendKeys("Parent");
		Thread.sleep(1000);
		d.findElement(By.className("button")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[5]/td[1]/span/a")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='leftmenu']/ul/li[1]/a")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr[5]/td[2]/span/a")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='leftmenu']/ul/li[1]/a")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='leftmenu']/ul/li[2]/a")).click();
		d.close();

	}

}
