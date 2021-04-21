package com.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/1/27 17:36
 */
public class TestLog {
	static Logger logger = Logger.getLogger(TestLog4j.class);
	@Before
	public void setUp() throws Exception {
		PropertyConfigurator.configure("common/log4j.properties");
	}

	@Test
	public void test1(){
		logger.debug("我是debug.");
	}

	@Test
	public void test2(){
		String user_dir = System.getProperty("user.dir");
		logger.debug("user_dir= "+user_dir);
	}

	@Test
	public void test3(){
		System.out.println("test1()");
	}
}
