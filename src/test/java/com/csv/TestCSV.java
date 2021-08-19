package com.csv;

import au.com.bytecode.opencsv.CSVReader;
import com.log.TestLog4j;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.junit.platform.commons.logging.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
	public void testReadCsv(){
		//加载csv 文件
		try {
			CSVReader reader = new CSVReader(new FileReader("resources/Files/test.csv"));
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
