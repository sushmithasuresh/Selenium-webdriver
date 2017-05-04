package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sastra {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\TCS\\elective 3\\software\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		d.navigate().to("http://webstream.sastra.edu/sastrapwi/");
		d.manage().window().maximize();
		d.findElement(By.xpath(".//*[@id='txtRegNumber']")).sendKeys("117015146");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='txtPwd']")).sendKeys("15111995");
		Thread.sleep(4000);
		d.findElement(By.xpath(".//*[@id='frmLogin']/table/tbody/tr[3]/td/table/tbody/tr[6]/td/input[1]")).click();
		Thread.sleep(1000);
		d.close();
	}

}
