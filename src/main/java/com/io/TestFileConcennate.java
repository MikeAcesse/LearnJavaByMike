package com.io;

import java.io.*;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/22 10:24
 */
public class TestFileConcennate {
	public static void main(String[] args) {
		concennateFile("E:/hello.log","E:/fan.log");
	}
	public static void concennateFile(String... fileName){
		String str;
		//构建对该文件的输出流
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("E:/coon.txt"));
			for (String name:fileName
			     ) {
				BufferedReader reader = new BufferedReader(new FileReader(name));
				while((str =reader.readLine())!=null){
					writer.write(str);
					writer.newLine();
				}

			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

