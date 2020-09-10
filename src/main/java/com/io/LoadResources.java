package com.io;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/8/3 9:02
 */
public class LoadResources {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = new FileInputStream("target/classes/db.properties");
		Properties p = new Properties();
		p.load(inputStream);
		System.out.println(p);
		System.out.println("username: "+p.getProperty("username"));
		System.out.println("password: "+p.getProperty("password"));
		p.setProperty("gender","man");
		System.out.println(p);

		OutputStream outputStream = new FileOutputStream("resources/db1.properties");
		p.store(outputStream,"new properties");

		Set<String> keySet=p.stringPropertyNames();
		System.out.println(keySet);
		System.out.println("***********propertyNames :enumeration****************");
		Enumeration e = p.propertyNames();
		while(e.hasMoreElements()){
			String e1= (String)e.nextElement();
			System.out.println(e1+",");

		}


		System.out.println("***********list outstream****************");
		PrintStream printStream = new PrintStream("resources/db2.properties");
		p.list(printStream);
		FileReader fileReader = new FileReader("target/classes/db.properties");
		Properties p1 = new Properties();
		p1.load(fileReader);
		System.out.println("***********list printwriter****************");
		PrintWriter printWriter = new PrintWriter("resources/db3.properties");
		p1.list(printWriter);
		printWriter.flush();

		System.out.println("***********next line**********************");
		printWriter.close();
		outputStream.close();
		fileReader.close();
		inputStream.close();
		System.out.println("***********next line**********************");


	}
}
