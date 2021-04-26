package com.lan;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/26 13:48
 */
public class TestSystem {
	@Test
	public void test1(){
		Properties prop= System.getProperties();
		System.out.println(prop.toString());
		try {
			//PrintStream out = new PrintStream(new File("D:\\lib\\fan.log"));
			PrintWriter out = new PrintWriter(new File("D:\\lib\\fan.properties"));
			prop.list(out);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
