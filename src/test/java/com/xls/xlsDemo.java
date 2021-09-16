package com.xls;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.junit.Test;

import javax.swing.*;
import java.io.*;
import java.util.Random;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/23 12:13
 */
public class xlsDemo {
	/**
	 * 创建xls文档
	 * @throws IOException
	 */
	@Test
	public void createxls() throws IOException {
		String filePath = "D:\\Excel\\sample.xls"; //文件路径
		FileOutputStream out = new FileOutputStream(filePath);
		HSSFWorkbook workbook = new HSSFWorkbook(); // 创建Excel文件(Workbook)
		workbook.createSheet("test"); //创建工作表（sheet）
		workbook.createSheet("fanzhikang");
		workbook.write(out); //保存Excel 文件
		out.close();

	}

	/**
	 * 单元格赋值
	 */
	@Test
	public void testCreateSimpleExcel(){
        HSSFWorkbook workbook = new HSSFWorkbook();
		/**
		 * createSheet存在有参和无惨两种形式，主要设置sheet名称
		 */
		HSSFSheet sheet = workbook.createSheet("课程表");
		HSSFRow row= sheet.createRow(0); //创建第一行

		/**
		 * 我们知道课程表第一行是代表周一到周五,下面我们用两种方式创建Cell
		 * 一种用变量，另一种未用变量,用变量的好处后面可以体会到。
		 */
		HSSFCell cell = row.createCell(0);
		cell.setCellValue("星期一");
		row.createCell(1).setCellValue("星期二");
		row.createCell(2).setCellValue("星期三");
		row.createCell(3).setCellValue("星期四");
		row.createCell(4).setCellValue("星期五");
		/**
		 * 上面我们只是设置了首行，后面课程我们用同样的方法设置，
		 * 这里面我们用循环方法设置课程
		 */
		Random random = new Random();
		String[] course = {"语文","数学","英语","物理","化学","政治","历史","音乐","美术","体育"};
		//循环产生7行row
		for (int i = 1; i < 7; i++) {
			//每个row的1-5个cell设置值,我用随机取数组来写值。
			HSSFRow row_i = sheet.createRow(i);
			for (int j = 0; j <=4 ; j++) {
				int n = random.nextInt(10);
				row_i.createCell(j).setCellValue(course[i]);
			}
		}
		try {
			FileOutputStream out = new FileOutputStream("D:\\Excel\\classes.xls");
			workbook.write(out);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 合并单元格
	 */
	@Test
	public void createMoveExcel(){
		try {
			FileInputStream is = new FileInputStream("D:\\Excel\\classes.xls");
			HSSFWorkbook workbook = new HSSFWorkbook(is);
			HSSFSheet sheet = workbook.getSheet("课程表");
			sheet.shiftRows(0,sheet.getLastRowNum(),1);
			sheet.shiftRows(6,sheet.getLastRowNum(),1);
			HSSFRow row = sheet.createRow(0);
			HSSFCell cell = row.createCell(0);
			cell.setCellValue("课程表");

			HSSFRow srow = sheet.createRow(6);
			HSSFCell scell = srow.createCell(0);
			scell.setCellValue("午休");

			CellRangeAddress address = new CellRangeAddress(0,0,0,4);
			sheet.addMergedRegion(address);

			CellRangeAddress secondAddress = new CellRangeAddress(6,6,0,4);
			sheet.addMergedRegion(secondAddress);

			FileOutputStream os = new FileOutputStream("D:\\Excel\\classes.xls");
			workbook.write(os);
			is.close();
			os.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	/**
	 * 合并单元格
	 */
	@Test
	public void createSimpleExcel(){
		try {
			HSSFWorkbook workbook=new HSSFWorkbook();
			/**
			 * createSheet存在有参和无参两种形式，主要设置sheet名字
			 */
			HSSFSheet sheet=workbook.createSheet("课程表");
			HSSFRow firstrow=sheet.createRow(0);//创建第一行
			HSSFCell cell=firstrow.createCell(0);
			cell.setCellValue("课程表");
			CellRangeAddress address=new CellRangeAddress(0,0,0,5);
			sheet.addMergedRegion(address);
			/**
			 * 我们知道课程表第一行是代表周一到周五,下面我们用两种方式创建Cell,
			 * 一种用变量，另一种未用变量,用变量的好处后面可以体会到。
			 */
			HSSFRow sencodrow=sheet.createRow(1);//创建第二行
			//这里面我们第一列不用是因为第三行存在合并的上午单元格，自己体会下
			sencodrow.createCell(1).setCellValue("星期一");
			sencodrow.createCell(2).setCellValue("星期二");
			sencodrow.createCell(3).setCellValue("星期三");
			sencodrow.createCell(4).setCellValue("星期四");
			sencodrow.createCell(5).setCellValue("星期五");
			/**
			 * 上面我们只是设置了首行，后面课程我们用同样的方法设置，
			 * 这里面我们用循环方法设置课程
			 */
			Random random=new Random();
			String[] course={"语文","数学","英语","物理","化学","政治","历史","音乐","美术","体育"};
			//循环产生7行row
			for(int j=2;j<=9;j++){
				//每个row的1-5个cell设置值,我用随机取数组来写值。
				HSSFRow row_j=sheet.createRow(j);
				//第六行是午休
				if(j==6){
					row_j.createCell(0).setCellValue("午休");
					CellRangeAddress secondaddress=new CellRangeAddress(6,6,0,5);
					sheet.addMergedRegion(secondaddress);
					continue;
				}
				//每行开始都要空出一列来让我们能增加上午下午单元格
				for(int k=1;k<=5;k++){
					int i=random.nextInt(10);
					row_j.createCell(k).setCellValue(course[i]);
				}
			}
			sheet.getRow(2).createCell(0).setCellValue("上午");
			sheet.getRow(7).createCell(0).setCellValue("下午");
			CellRangeAddress thridaddress=new CellRangeAddress(2,5,0,0);
			sheet.addMergedRegion(thridaddress);

			CellRangeAddress fourthaddress=new CellRangeAddress(7,9,0,0);
			sheet.addMergedRegion(fourthaddress);

			FileOutputStream out=new FileOutputStream("D:\\Excel\\classes.xls");
			workbook.write(out);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void createStyleExcel() throws IOException {
		FileInputStream is = new FileInputStream("D:\\Excel\\classes.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(is);
		HSSFSheet sheet = workbook.getSheet("课程表");
		HSSFRow firstrow=sheet.getRow(0); //获取课程表行
		HSSFRow sencodrow=sheet.getRow(2);//获取上午行
		HSSFRow sixthrow=sheet.getRow(6);//获取午休行
		HSSFRow ninthrow=sheet.getRow(7);//获取下午行
		HSSFCellStyle style = workbook.createCellStyle();
		style.setAlignment(HorizontalAlignment.CENTER); //水平居中
		style.setVerticalAlignment(VerticalAlignment.CENTER); //垂直居中
		firstrow.getCell(0).setCellStyle(style);
		sencodrow.getCell(0).setCellStyle(style);
		sixthrow.getCell(0).setCellStyle(style);
		ninthrow.getCell(0).setCellStyle(style);
		FileOutputStream out=new FileOutputStream("D:\\Excel\\classes.xls");
		workbook.write(out);
		out.close();
	}


    //使用边框
	@Test
	public void createBoderExcel() throws IOException {
		FileInputStream is = new FileInputStream("D:\\Excel\\classes.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(is);
		HSSFSheet sheet = workbook.getSheet("课程表");
		HSSFCellStyle firststyle=workbook.createCellStyle();//第一种样式针对第一个单元格的，不存在右边线
		firststyle.setBorderTop(BorderStyle.DASH_DOT_DOT);
		firststyle.setBorderLeft(BorderStyle.DASH_DOT_DOT);
		firststyle.setBorderBottom(BorderStyle.DASH_DOT_DOT);
		firststyle.setTopBorderColor(HSSFColor.HSSFColorPredefined.BLACK.getIndex());
		firststyle.setLeftBorderColor(HSSFColor.HSSFColorPredefined.BLACK.getIndex());
		firststyle.setBottomBorderColor(HSSFColor.HSSFColorPredefined.BLACK.getIndex());

		HSSFCellStyle secondstyle=workbook.createCellStyle();//第二种样式针对中间单元格的，不存在左右边线
		secondstyle.setBorderTop(BorderStyle.DASH_DOT_DOT);
		secondstyle.setBorderBottom(BorderStyle.DASH_DOT_DOT);
		secondstyle.setTopBorderColor(HSSFColor.HSSFColorPredefined.BLACK.getIndex());
		secondstyle.setBottomBorderColor(HSSFColor.HSSFColorPredefined.BLACK.getIndex());


		HSSFCellStyle thirdstyle=workbook.createCellStyle();//第三种样式针对最后单元格的，不存在左边线
		thirdstyle.setBorderTop(BorderStyle.DASH_DOT_DOT);
		thirdstyle.setBorderRight(BorderStyle.DASH_DOT_DOT);
		thirdstyle.setBorderBottom(BorderStyle.DASH_DOT_DOT);
		thirdstyle.setTopBorderColor(HSSFColor.HSSFColorPredefined.BLACK.getIndex());
		thirdstyle.setRightBorderColor(HSSFColor.HSSFColorPredefined.BLACK.getIndex());
		thirdstyle.setBottomBorderColor(HSSFColor.HSSFColorPredefined.BLUE.getIndex());
		HSSFRow firstrow=sheet.getRow(0);
		for(int i=0;i<firstrow.getLastCellNum();i++){
			if(i==0){
				firststyle.setAlignment(HorizontalAlignment.CENTER);
				firstrow.getCell(i).setCellStyle(firststyle);
			}else if(i==firstrow.getLastCellNum()-1){
				firstrow.createCell(i);//注意前面实例针对第一行只创建了第一列，因此在这里我们需要创建列，不然不会设置边框
				firstrow.getCell(i).setCellStyle(thirdstyle);
			}else{
				firstrow.createCell(i);
				firstrow.getCell(i).setCellStyle(secondstyle);
			}
		}
		FileOutputStream out=new FileOutputStream("D:\\Excel\\classes.xls");
		workbook.write(out);
		out.close();
	}

	/**
	 *  设置页眉和页脚
	 */
	@Test
	public void createHeadAndFooter() throws IOException {

		FileInputStream is = new FileInputStream("D:\\Excel\\classes.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(is);
		HSSFSheet sheet = workbook.getSheet("课程表");
		HSSFHeader header = sheet.getHeader(); //得到页眉
		header.setLeft("页眉左边");
		header.setRight("页眉右边");
		header.setCenter("页眉中间");
		HSSFFooter footer = sheet.getFooter(); ////得到页脚
		footer.setLeft("页脚左边");
		footer.setRight("页脚右边");
		footer.setCenter("页脚中间");
		FileOutputStream out = new FileOutputStream("D:\\Excel\\classes.xls");
		out.close();
		is.close();
	}



	@Test
	public void  createFormula() throws IOException {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet("基本计算");
		HSSFRow row=sheet.createRow(0);
		HSSFCell cell0=row.createCell(0);
				cell0.setCellFormula("5*5+2");//可直接赋予一个简单的计算公式
		cell0=row.createCell(1);
				cell0.setCellValue(20);
		cell0=row.createCell(2);
				cell0.setCellFormula("A1+B1");
		cell0=row.createCell(3);
				cell0.setCellFormula("A1-B1");
		cell0=row.createCell(4);
				cell0.setCellFormula("A1*B1");
		cell0=row.createCell(5);
				cell0.setCellFormula("A1/B1");
		FileOutputStream out=new FileOutputStream("D:\\Excel\\基本计算.xls");
		workbook.write(out);
		out.close();
	}

	@Test
	public void  createFormula1() throws IOException {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet("基本计算");
		HSSFRow row=sheet.createRow(0);
		row.createCell(0).setCellValue(1);
		row.createCell(1).setCellValue(2);
		row.createCell(2).setCellValue(3);
		row.createCell(3).setCellValue(4);
		row.createCell(4).setCellValue(5);
		row.createCell(5).setCellValue(6);
		row.createCell(6).setCellValue(7);
		//第七/八列进行计算,两种都等价A1+B1+C1+D1+E1+F1+G1
		row.createCell(7).setCellFormula("sum(A1,B1,C1,D1,E1,F1,G1)");
		row.createCell(8).setCellFormula("sum(A1:G1)");
		FileOutputStream out=new FileOutputStream("D:\\Excel\\基本计算sum.xls");
		workbook.write(out);
		out.close();
	}

	@Test
	public void  createABSDemo () throws IOException {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet("基本计算");
		HSSFRow row0=sheet.createRow(0);
		row0.createCell(0).setCellValue(-1234);
		row0.createCell(1).setCellValue(5678);

		HSSFRow row1=sheet.createRow(1);
		row1.createCell(0).setCellValue(23.456);
		row1.createCell(1).setCellValue(-54.562);

		HSSFRow row2=sheet.createRow(2);
		row2.createCell(0).setCellValue(8.49314);
		row2.createCell(1).setCellValue(12.927);
		/**
		 * 取绝对值
		 */
		row0.createCell(2).setCellFormula("ABS(A1)");
		row0.createCell(3).setCellFormula("ABS(B1)");
		/**
		 * 取整
		 */
		row1.createCell(2).setCellFormula("INT(A2)");
		row1.createCell(3).setCellFormula("INT(B2)");
		/**
		 * 四舍五入
		 */
		row2.createCell(2).setCellFormula("ROUND(A3,1)");
		row2.createCell(3).setCellFormula("ROUND(B3,1)");
		FileOutputStream out=new FileOutputStream("D:\\Excel\\基本计算abs.xls");
		workbook.write(out);
		out.close();
	}
}

