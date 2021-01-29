package com.xml;

import info2soft.qa.common.configuration.ConfigurationUtil;
import org.junit.Test;

import java.util.Properties;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/29 14:56
 */
public class Dom4JforXml1 {
	@Test
	public void test1(){
		Properties properties = ConfigurationUtil.loadInstanceInfo("InstanceInfo.xml");
		String i2upHome = properties.getProperty("i2upHome");
		System.out.println(i2upHome);
	}
}
