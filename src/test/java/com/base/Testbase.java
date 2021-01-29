package com.base;

import info2soft.qa.common.util.StringUtil;
import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/9/29 11:30
 */
public class Testbase {
	@Test
	public void test1(){
		double x = 12.34;
		System.out.println((int)x);
		double y = 12.78;
		System.out.println((int)y);
		int z = Integer.parseInt(new java.text.DecimalFormat("0").format(y));
		int z1 = Integer.parseInt(new DecimalFormat("0").format(x));
		System.out.println(z1);
		System.out.println(z);

	}

	@Test
	public void test2(){
		String douNum ="11.00" ;
		int intNum = Double.valueOf(douNum).intValue();
		System.out.println(intNum);
	}

	@Test
	public void test3(){
		//getI2upVersion
		String version ="7.1.68.20092800";
		String[] subversions = version.split("\\.");
		System.out.println(subversions);
	}

	@Test
	public void test4(){
		String a = "99.9";
		String b = "9996";
		String c = "99.97";
		System.out.println(isNumeric(a));
		System.out.println(isNumeric(b));
		System.out.println(isNumeric(c));

	}
	public static boolean isNumeric(String str){
		Pattern pattern = Pattern.compile("[0-9]+\\.?[0-9]*");
		return pattern.matcher(str).matches();
	}

	@Test
	public void test5(){
		String result ="Windows [版本 6.1.7601]\n" +
				"\n" +
				"版权所有 (c) 2009 Microsoft Corporation。保留所有权利。\n" +
				"\n" +
				"\n" +
				"\n" +
				"C:\\Program Files\\OpenSSH\\home\\Administrator>cd  /d D:\\work\\test\\monitor\\backup\\i2-12145\\& attrib * | grep  -e end \n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_0.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_1.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_10.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_11.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_12.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_13.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_14.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_15.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_16.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_17.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_18.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_19.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_2.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_20.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_21.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_22.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_23.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_24.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_25.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_26.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_27.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_28.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_29.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_3.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_30.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_31.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_32.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_33.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_34.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_35.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_36.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_37.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_38.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_39.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_4.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_40.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_41.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_42.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_43.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_44.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_45.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_46.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_47.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_48.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_49.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_5.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_6.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_7.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_8.txtend\n" +
				"A            D:\\work\\test\\monitor\\backup\\i2-12145\\aa_9.txtend\n" +
				"\n" +
				"\n" +
				"D:\\work\\test\\monitor\\backup\\i2-12145>";

		List<String> list = getWindowOutput(result,"end");
		System.out.println(list.toString());

	}


	public static List<String> getWindowOutput(String inputText, String... searchText) {
		if (StringUtil.isNotEmpty(inputText)) {
			List<String> afterFiltered = StringUtil.parseLines(inputText);
			Iterator<String> it = afterFiltered.iterator();
			while(it.hasNext()){
				String x = it.next().trim();
				if(searchText.length>0){
					List<String> subText = StringUtil.toStringList(searchText);
					if(subText.size()==1){
						if(x.contains("C:\\Program")||!x.contains(subText.get(0))) {
							it.remove();
						}else if(subText.size()==2){
							if(x.contains("C:\\Program")||!x.contains(subText.get(0))||!x.contains(subText.get(1)))
								it.remove();
						}
					}else{
						if(x.contains("Last login")|| x.contains("Microsoft")||x.contains("版权所有")
								|| x.contains("C:\\Program Files") || x.contains("D:") || x.contains("Windows") || x.isEmpty()) {
							it.remove();
						}
					}
				}


			}
			return afterFiltered;
		}
		return Collections.EMPTY_LIST;
	}

}
