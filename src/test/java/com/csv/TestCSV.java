package com.csv;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import com.log.TestLog4j;
import org.apache.http.impl.conn.Wire;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.junit.platform.commons.logging.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * https://www.cnblogs.com/miaojjblog/p/9682397.html
 * opencsv 读取csv 文件
 * @author fanzk
 * @version 1.8
 * @date 2021/8/19 9:09
 */
public class TestCSV {
	@Test
	public void testReadCsv() throws IOException {
		//加载csv 文件
		CSVReader reader =null;
		try {
			reader = new CSVReader(new FileReader("C:\\Users\\c0645\\Downloads\\user_ex.csv"));
			//把内容添加到list中
			List<String[]> li = reader.readAll();
			System.out.println("总函数为："+li.size());
			//新建一个Itera引用
			Iterator<String[]> il = li.iterator();
			//遍历每个值
			while(il.hasNext()){
				String[] str = il.next();
				System.out.println("本行的值为：");
				for (int i = 0; i < str.length; i++) {
					System.out.println(" "+str[i]);
				}
				System.out.println("  ");
			}

		} catch (IOException e) {
			e.printStackTrace();
			reader.close();
		}
	}

	@Test
	public void testCSVWriter() throws IOException {
		File csvFile = new File("C:\\Users\\c0645\\Downloads\\user_ex.csv");
		//File csvFile = new File("resources/Files/user_ex.csv");
		if(!csvFile.exists()){
			csvFile.createNewFile();
		}
//		List<String[]> list = new ArrayList<>();
//		String s1 = "123";
//		for (int i = 0; i < 4; i++) {
//			String[] ss = {String.valueOf(i),String.valueOf(i),String.valueOf(i)};
//			list.add(ss);
//		}

		//String[] row_0= new String[]{"","",""};
		String[] row_1= new String[]{"caoxx","12345678","admin"};
		String[] row_2= new String[]{"123test","123qwe-=","operator"};
		List<String[]> content = new ArrayList<>();
		//content.add(row_0);
		content.add(row_1);
		content.add(row_2);
		//CSVWriter writer = new CSVWriter(new FileWriter(csvFile));
		//CSVWriter writer = new CSVWriter(new OutputStreamWriter(new FileOutputStream(csvFile),"GBK"),CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER);
		CSVWriter writer = new CSVWriter(new FileWriter(csvFile,true),CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER);
//		writer.writeNext(new String[]{s1,s1,s1});
//		writer.writeNext(new String[]{"","",""});
		writer.writeAll(content);
		writer.flush();
		writer.close();
	}
}
