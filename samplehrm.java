package com;

import java.util.concurrent.TimeUnit;

//import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.internal.MouseAction;

public class samplehrm {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\TCS\\elective 3\\software\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.navigate().to("https://enterprise-demo.orangehrmlive.com/symfony/web/index.php/auth/login");
		d.manage().window().maximize();
		d.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("anthony.nolan");
		d.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("anthony.nolan");
		d.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		Thread.sleep(1000);
		
		d.navigate().to("https://enterprise-demo.orangehrmlive.com/news/viewDocumentArticle/type/documents/status/published");
	
		//Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@id='ui-id-5']/span")).click();
		
		Thread.sleep(1000);
		d.switchTo().frame(2);
		String msg=d.findElement(By.tagName("body")).getText();
		d.switchTo().parentFrame();
		System.out.println(msg);
		Thread.sleep(1000);
		d.close();

}

}
