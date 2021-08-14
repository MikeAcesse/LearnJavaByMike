package com.json;

import java.io.*;
import java.util.Properties;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/6/1 15:21
 */
public class JsonUtil {
	public static Properties prop = new Properties();
	public static final String LOCAL_PROP_FILE="target/classes/i2Node.properties";
	public static final String NODE_USER = "node_user";
	public static void loadProperties(String fileName) throws IOException {
		File propFile = new File(fileName);
		if(!propFile.exists()){
			fileName = LOCAL_PROP_FILE;
		}
		try(InputStream input = new FileInputStream(fileName)){
			prop.load(input);
			String nodeuser = JsonUtil.prop.getProperty(JsonUtil.NODE_USER);
			if(nodeuser==null || nodeuser.equals("")){
				nodeuser="root";
				prop.setProperty(NODE_USER,nodeuser);
				JsonUtil.saveProperties(fileName);
			}
		}
	}

	private static void saveProperties(String fileName) throws IOException {
		FileOutputStream out= new FileOutputStream(fileName);
		prop.store(out,"created by fan");
	}

}
