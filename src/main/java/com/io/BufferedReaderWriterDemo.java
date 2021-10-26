package com.io;

import java.io.*;
import java.util.Scanner;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/22 10:51
 */
public class BufferedReaderWriterDemo {
	public static void main(String[] args) {
		//缓冲System.in输入流
		//System.in 是bit流，可以通过InputStreamReader将其转化为字符流
		BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			//缓冲FileWriter
			BufferedWriter bufWriter = new BufferedWriter(new FileWriter("E:/ba.log"));
			String input = null;
			//每读一行进行一次写入动作
			while(!(input = bufReader.readLine()).equals("quit")){
				bufWriter.write(input);
				bufWriter.newLine(); //写入换行符
			}
			bufReader.close();
			bufWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException  e){
			System.out.println("没有指定的文件");
		}
	}


}
