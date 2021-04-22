package com.io;

import org.junit.Test;

import java.io.*;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/21 19:24
 */
public class TestFile {

	@Test
	public void testFileClass(){
		File file = new File("E:/fan/zhi/kang/hello.log");
		//file.mkdir();
		file.mkdirs();
		//file.createNewFile();
		long size = file.getFreeSpace();
		System.out.println(size);
		String parentFile = file.getParent();
		System.out.println("getParenet is : "+ parentFile);
		String pathFile = file.getPath();
		System.out.println("getPath is : "+ pathFile);
		try {
			File f1 = file.getCanonicalFile();
			System.out.println("f1 -> "+f1.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		file.delete();

	}

	@Test
	public void testFileCount() throws IOException {
		int count = 0 ;
		InputStream is = null;
		try {
			is = new FileInputStream(new File("E:\\fan\\zhi\\kang\\liaoxuefeng-learn-java-master(2).zip"));
			while(is.read() != -1){
				count++;
			}
			System.out.println("-----长度是： "+count+"字节");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			is.close();
		}


	}

	@Test
	public void testObjectStream() {
		ObjectInputStream objectReader = null;
		ObjectOutputStream objectWriter = null;

		try {
			objectWriter = new ObjectOutputStream(new FileOutputStream("E:/student.txt"));
			objectWriter.writeObject(new Student("gg",22));
			objectWriter.writeObject(new Student("tt",23));
			objectWriter.writeObject(new Student("rr",24));
			objectWriter.writeObject(new Student("ff",25));

			objectReader = new ObjectInputStream(new FileInputStream("E:/student.txt"));
			for (int i = 0; i < 4; i++) {
				System.out.println(objectReader.readObject());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				objectWriter.close();
				objectReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}


	@Test
	public void testPrint(){
		char[] buffer = new char[512]; //一次取出的字节数大小，缓冲区大小
		int numberRead = 0;
		FileReader reader = null ; //读取字符文件的流
		PrintWriter writer = null ;// 写字符到控制台的流
		try {
			reader = new FileReader("E:/测试.txt");
			writer = new PrintWriter(System.out); //PrintWriter 可以输出字符到文件，也可以输出到控制台
			//writer = new PrintWriter("E:/k.log"); //PrintWriter 可以输出字符到文件，也可以输出到控制台
			while((numberRead = reader.read(buffer))!= -1){
				writer.write(buffer,0,numberRead);
			}
			writer.close();
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void FileConcatenate(){
		/**
		 * 包装类进行文件级联操作
		 */

	}

}
