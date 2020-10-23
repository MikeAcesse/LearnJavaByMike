package com.xls;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/23 12:13
 */
public class xlsDemo {
	@Test
	public void createxls() throws IOException {
		String filePath = "D:\\Excel\\sample.xls"; //文件路径
		HSSFWorkbook workbook = new HSSFWorkbook(); // 创建Excel文件(Workbook)
		HSSFSheet sheet  =  workbook.createSheet(); //创建工作表（sheet）
		sheet = workbook.createSheet("test"); //创建工作表（sheet）
		FileOutputStream out = new FileOutputStream(filePath);
		workbook.write(out); //保存Excel 文件
		out.close();
	}
}
