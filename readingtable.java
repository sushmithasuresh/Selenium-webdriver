package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readingtable {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\TCS\\elective 3\\software\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.navigate().to("http://toolsqa.wpengine.com/automation-practice-table");
		d.manage().window().maximize();
		String t1=d.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[4]/td[1]")).getText();
		System.out.println(t1);
		String t="Clock Tower Hotel";
		
		for(int i=1;i<=4;i++)
		{
			String t2=d.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+i+"]/th")).getText();
			if(t2.equalsIgnoreCase(t))
			{
				for(int j=1;j<=5;j++)
				{
				String ans=d.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(ans);
				}
			}
		}
		d.close();
	}

}
