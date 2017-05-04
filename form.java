package com;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

//import org.openqa.jetty.html.Select;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class form {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\TCS\\elective 3\\software\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.navigate().to("http://demoqa.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
Thread.sleep(1000);
driver.findElement(By.xpath(".//*[@id='name_3_firstname']")).sendKeys("suhmvjbmj");
Thread.sleep(1000);
driver.findElement(By.xpath(".//*[@id='name_3_lastname']")).sendKeys("S");
Thread.sleep(1000);
driver.findElement(By.xpath(".//*[@id='pie_register']/li[2]/div/div/input[1]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath(".//*[@id='pie_register']/li[3]/div/div/input[3]")).click();
Thread.sleep(1000);
Select dd=new Select(driver.findElement(By.xpath(".//*[@id='dropdown_7']")));
dd.selectByValue("India");
//driver.findElement(By.xpath(".//*[@id='dropdown_7']")).sendKeys("India");
Thread.sleep(1000);
driver.findElement(By.xpath(".//*[@id='mm_date_8']")).sendKeys("11");
Thread.sleep(1000);
driver.findElement(By.xpath(".//*[@id='dd_date_8']")).sendKeys("15");
Thread.sleep(1000);
driver.findElement(By.xpath(".//*[@id='yy_date_8']")).sendKeys("1995");
Thread.sleep(1000);

driver.findElement(By.xpath(".//*[@id='phone_9']")).sendKeys("1234567890");
Thread.sleep(1000);
driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("sdk5u");
Thread.sleep(1000);
driver.findElement(By.xpath(".//*[@id='email_1']")).sendKeys("fa4sj@gmail.com");
Thread.sleep(1000);
/*driver.findElement(By.xpath(".//*[@id='profile_pic_10']")).sendKeys("F:\\TCS\\elective 3\\sush.jpg");
Thread.sleep(1000);*/
driver.findElement(By.xpath(".//*[@id='description']")).sendKeys("my name is sushmitha");
Thread.sleep(1000);
driver.findElement(By.xpath(".//*[@id='password_2']")).sendKeys("12344a123sskd");
Thread.sleep(1000);
driver.findElement(By.xpath(".//*[@id='confirm_password_password_2']")).sendKeys("12344a123sskd");
Thread.sleep(1000);

driver.findElement(By.name("pie_submit")).click();

Thread.sleep(3000);
String msg=driver.findElement(By.xpath(".//*[@id='post-49']/div/p")).getText();
System.out.println(msg);
File src=new File("F:\\TCS\\elective 3\\sample1.xlsx");
FileInputStream fis=new FileInputStream(src);
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet ws=wb.getSheetAt(0);
ws.getRow(0).createCell(2).setCellValue(msg);
FileOutputStream fos=new FileOutputStream(src);
wb.write(fos);
fos.close();
String ms=ws.getRow(0).getCell(2).getStringCellValue();
System.out.println(""+ms);


driver.close();

	}

}
