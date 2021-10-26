package utils;

import dataobject.CopyRule;
import dataobject.Node;
import info2soft.qa.common.util.StringUtil;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.*;
import java.util.*;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/6/11 14:27
 */
public class JsonUtil {
	public static Properties prop = new Properties();
	public static final String PROP_FILE="/i2up.properties";
	public static final String LOCAL_PROP_FILE="i2up.properties";
	public static String fileName = PROP_FILE;

	public static final String CENTCTL_USER = "loginUserName";
	public static final String CENTCTL_PWD = "loginPwd";
	public static final String CENTCTL_IP = "i2upIp";
	public static final String CENTCTL_PORT= "i2upPort";
	public static final String NODE_NAME = "node_name";
	public static final String NODE_IP = "node_ip";
	public static final String NODE_USER = "node_user";
	public static final String NODE_PASS = "node_pwd";
	public static final String SHARED_DIR = "shareDir";

	public static void loadProperties() throws Exception {
		File propFile = new File(fileName);
		if(!propFile.exists()){
			fileName = LOCAL_PROP_FILE;
		}

		try(InputStream input = new FileInputStream(fileName)){
			prop.load(input);
			String nodeuser = JsonUtil.prop.getProperty(JsonUtil.NODE_USER);
			if(nodeuser == null || nodeuser.equals("")){
				nodeuser = "fanzhikang";
				prop.setProperty(NODE_USER,nodeuser);
				saveProperites();
			}
		}
	}

	public static void saveProperites() throws IOException {
		FileOutputStream out = new FileOutputStream(fileName);
		prop.store(out,"created by fzk");
	}

	public static void loadProperties(String fileName) throws IOException {
		try(InputStream input = new FileInputStream(fileName)) {
			prop.load(input);
		}
	}

	public static String stackTraceToString(Throwable e){
		StringBuilder sb = new StringBuilder();
		for (StackTraceElement element: e.getStackTrace()
		     ) {
			sb.append(element.toString());
			sb.append("\n");
		}
		return sb.toString();
	}

	public static JSONObject loadInfoJson(String fileName) throws IOException {
		String content = "";
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(fileName));
		String line = reader.readLine();
		while (line !=null){
			content = content + line + System.lineSeparator();
			line = reader.readLine();
		}
		reader.close();
		System.out.println("request json is :\n"+content);
		JSONObject a = new JSONObject(content);
		return a;

	}

	public static Map<String, Node> getNodeInfo(JSONObject testData,String ipList,String plateformList){
		JSONObject nodes = testData.getJSONObject("Node");
		List<String> nodeNames = new ArrayList<>(nodes.keySet());
		Collections.sort(nodeNames);
		String[] ips = ipList.split(",");
		int expectedNodeNumber = nodeNames.size();
		int actualIpNumber = ips.length;
		int availableNumber = Math.min(expectedNodeNumber,actualIpNumber);
		List<String> osInfoList = new ArrayList<>(actualIpNumber);
		for (String platform: plateformList.split(",")
		     ) {
			String[] osInfoArray = platform.split(":");
			for (int i = 0; i < Integer.parseInt(osInfoArray[1]); i++) {
				osInfoList.add(osInfoArray[0]);
			}

		}
		Map<String,Node> nodeMap = new LinkedHashMap<>(availableNumber);
		for (int i = 0; i < availableNumber; i++) {
			String nodeName = nodeNames.get(i);
			String[] osInfo = osInfoList.get(i).split("_");
			JSONObject nodeData = nodes.getJSONObject(nodeName);
			Node node = new Node(nodeName);
			node.setCcIp(ips[i]);
			node.setDataIp(ips[i]);
			node.setOsType(osInfo[0]);
			node.setOsVersion(osInfo[1]);
			if(osInfo[0].equalsIgnoreCase("windows")){
				node.setUser("administrtor");

			}else{
				node.setUser("root");
				if(hasValidJsonData(nodeData,"includePath")){
					node.setIncludePath(nodeData.getString("includePath"));
				}
			}
			if(StringUtil.isNotEmpty(nodeData.getString("port"))){
				node.setPort(nodeData.getString("port"));
			}else {
				node.setPort("26821");
			}
			if(StringUtil.isNotEmpty(nodeData.getString("pwd"))) {
				node.setPwd(nodeData.getString("pwd"));
			} else {
				node.setPwd("123456");
			}
			if (StringUtil.isNotEmpty(nodeData.getString("license"))) {
				node.setLicense(nodeData.getString("license"));
			}
			if (nodeData.getString("note") != null) {
				node.setNote(nodeData.getString("note"));
			} else {
				node.setNote("");
			}
			nodeMap.put(nodeName, node);
		}
		return nodeMap;

	}



	private static boolean hasValidJsonData(JSONObject jsonData, String key) {
		try {

			return StringUtil.isNotEmpty(jsonData.getString(key));
		}catch (JSONException e){
			return false;
		}
	}

	public static boolean nil(String str){
		return str == null || str.isEmpty();
	}


	public static Map<String, CopyRule> getCopyRuleInfo(JSONObject testData){
		JSONObject rules = testData.getJSONObject("CopyRule");
		List<String> keyList = new ArrayList<>(rules.keySet());
		Collections.sort(keyList);
		Map<String,CopyRule> ruleMap = new LinkedHashMap<>(keyList.size());
		for (String key: keyList
		     ) {
			JSONObject rule = rules.getJSONObject(key);
			String mapType = rule.has("mapType")? rule.getString("mapType"):"";
			String unmonitoredDir = rule.has("unmonitoredDir")?rule.getString("unmonitoredDir"):"";
			ruleMap.put(key,new CopyRule(key,rule.getString("srcNode"),rule.getString("backupNode"),rule.getString("srcDir"),
					rule.getString("backupDir"),mapType,unmonitoredDir));
		}
		return ruleMap;
	}

	public static void main(String[] args) {
		try {
//			loadProperties();
//			loadProperties("i2up.properties");
			JSONObject infoObject = loadInfoJson("target/classes/move/move.json");
			Map<String,Node> nodeMap =getNodeInfo(infoObject,"10.1.2.16,10.1.2.150","centos_7.5:2");
			System.out.println(nodeMap.toString());
			getCopyRuleInfo(infoObject);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
