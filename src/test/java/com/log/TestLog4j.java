package com.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/20 17:57
 */
public class TestLog4j {
	static Logger logger = Logger.getLogger(TestLog4j.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("common/log4j.properties");
		//PropertyConfigurator.configure("common/log4j.xml");
		for (int i = 0; i < 2000; i++) {
			logger.trace("跟踪信息");
			logger.debug("调试信息");
			logger.info("输出信息");
			logger.warn("警告信息");
			logger.error("错误信息");
			logger.fatal("致命信息");
		}
	}
}
