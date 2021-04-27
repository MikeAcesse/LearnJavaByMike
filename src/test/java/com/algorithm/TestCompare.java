package com.algorithm;

import info2soft.qa.common.util.StringUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/26 17:01
 */
public class TestCompare {

	public  boolean mapCompare(Map<String,String> srcMap, Map<String,String>cmpMap){
		boolean isChange = true;
		for (Map.Entry<String,String> entry1: srcMap.entrySet()
		     ) {
           String m1Value = entry1.getValue() ==null?"":(String)entry1.getValue();
           String m2Value = cmpMap.get(entry1.getKey())==null?"":(String)cmpMap.get(entry1.getKey());
           if(!m1Value.equals(m2Value)){
           	   isChange =false;
           	   break;
           }
		}
		return isChange;
	}

	@Test
	public void test(){
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("key1", "key1");
		hashMap.put("key2", "key22");
		hashMap.put("key3", "key3");
		Map<String, String> hashMap2 = new HashMap<>();
		hashMap2.put("key1", "key1");
		hashMap2.put("key2", "key2");
		hashMap2.put("key3", "key3");
		boolean result = mapCompare(hashMap,hashMap2);
		System.out.println(result);

	}

	@Test
	public void test1(){
		String str ="{74051af3-37d8-47b8-83a2-2efef4796fdb}";
		str= str.replaceAll("\\{|}","");
		System.out.println(str);
	}

	@Test
	public void test2(){
		String str = "snapshot:    enabled, intval 24, limt 2, start 2021-04-26 18:13:55, policy 0";
		String str1 = str.replaceAll("snapshot:\\s+","");
		String info[] = str1.split(",");
		System.out.println(StringUtil.toPlainText(info,"-"));
	}
}
