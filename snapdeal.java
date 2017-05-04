package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class casestudy {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "F:\\TCS\\elective 3\\software\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.navigate().to("https://www.snapdeal.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath(".//*[@id='sdHeader']/div[4]/div[2]/div/div[3]/div[3]/div")).click();
		
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='sdHeader']/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[1]")).click();
		Thread.sleep(1000);
		d.switchTo().frame(0);
		d.findElement(By.xpath(".//*[@id='userName']")).sendKeys("assurancetcs2017@gmail.com");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='checkUser']")).click();
		Thread.sleep(1000);
	    d.findElement(By.xpath(".//*[@id='j_password_login_uc']")).sendKeys("ASSURANCETCS2017");
	    Thread.sleep(1000);
	    d.findElement(By.xpath(".//*[@id='submitLoginUC']")).click();
	    Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='inputValEnter']")).sendKeys("moto g4 mobile");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='sdHeader']/div[4]/div[2]/div/div[2]/button")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='619085191722']/div[1]/div/span/i")).click();
		Thread.sleep(1000);
		d.navigate().to("https://www.snapdeal.com/product/samsung-galaxy-a7/619085191722#bcrumbSearch:moto%20g4%20mobile");
		Thread.sleep(2000);
		d.navigate().to("https://www.snapdeal.com/cart/addToCart?supc=SDL210363592&vendorCode=Sce6e6&hardAdded=false");
		Thread.sleep(2000);
		d.findElement(By.xpath(".//*[@id='cartProductContainer']/div/div[2]/div[2]/div/div[2]/a")).click();
		Thread.sleep(1000);
	//	d.findElement(By.xpath(".//*[@id='checkout-continue']/input[2]")).click();
		//Thread.sleep(1000);
		
		d.findElement(By.xpath(".//*[@id='zip']")).sendKeys("613005");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='fullName']")).sendKeys("Sushmitha");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='address']")).sendKeys("cauvery nagar");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='nearestLandmark']")).sendKeys("opp to IT mahal");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='city']")).clear();
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='city']")).sendKeys("Thanjavur");
		Thread.sleep(1000);
		//d.findElement(By.xpath(".//*[@id='state']")).clear();
		//Thread.sleep(1000);
		//d.findElement(By.xpath(".//*[@id='state']")).sendKeys("Tamil nadu");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='shipping-address-form']/div/div[7]/div/label/span/span")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='mobile']")).sendKeys("8234567890");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='shipping-address-form']/div/div[10]/div/div[1]/label/span[1]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='delivery-modes-continue']")).click();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		//d.findElement(By.xpath(".//*[@id='make-payment']")).click();
		
		d.close();
		
	}

}
