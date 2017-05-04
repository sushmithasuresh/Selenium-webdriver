package com;

//import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class write {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		 File src=new File("F:\\TCS\\elective 3\\sample1.xlsx");
		 FileInputStream fis=new FileInputStream(src);
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 XSSFSheet ws=wb.getSheetAt(0);
		 ws.getRow(0).createCell(1).setCellValue("Parent");
		 FileOutputStream fos=new FileOutputStream(new File("F:\\TCS\\elective 3\\sample2.xlsx"));
		 wb.write(fos);
		 fos.close();
		 
		
		
	}

}
