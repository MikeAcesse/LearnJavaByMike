package com.io;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/21 15:22
 */
public class TestStringReaderAndStringWriter {
	public static void main(String[] args) throws IOException {
		//testStringWriter();
		testStringReader();
	}

	public static void testStringWriter(){
		char[] x = {'m','n'};
		StringWriter sw = new StringWriter(20);
		sw.write(x,0,1);
		sw.write('a');
		sw.write("bcd");
		sw.write("012",1,2);
		System.out.println(sw.toString());
		sw.append('K');
		sw.append("fanzhikang");
		sw.append("wanglaixin",4,10);
		System.out.println(sw.toString());
	}

	public static void testStringReader() throws IOException {
		StringReader sr = new StringReader("ABCDEFG");
		System.out.println((char)sr.read());  //a
		//如果支持标记读取，则标记当前的读取位置，也就是字符串中的第二个字符b
		if(sr.markSupported()){
			sr.mark(3); //查看源码后知道，这个参数3无任何意义
		}
		System.out.println((char)sr.read());//b
		System.out.println((char)sr.read());//c
		//sr.reset();  //从做标记的mark 开始读取
		System.out.println((char)sr.read()); //从当前读取位置设置为mark标记的值，输出为b
		char[] x = new char[3];
		sr.read(x,0,2);
		System.out.println(String.valueOf(x));
		sr.close();
	}

}
