package com.strings;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Test;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/9 14:53
 */
public class TestString3 {
	@Test
	public void test1() throws Exception {
		String[][] arrays= {
				{"2019年11月15日 08时63分","10"},
				{"2019年11月15日 08时03分","15"},
				{"2019年11月15日 09时63分","20"},
				{"2019年11月15日 24时63分","25"},
				{"2019年11月15日 08时63分","30"},
				{"2019年11月15日 18时63分","35"},
				{"2019年11月15日 08时63分","40"},
				{"2019年11月15日 08时63分","45"},
				{"2019年11月15日 15时00分","50"},
				{"2019年11月15日 18时01分","60"},
				{"2019年11月15日 18时01分","360"},
		};

		for(String[] arr:arrays) {
			String template=" {0} + {1}分 = {2}";
			Object[] objs={arr[0],arr[1],getNewTime(arr[0],arr[1])};
			System.out.println(MessageFormat.format(template, objs));
		}
	}

	public  String getNewTime(String datetime,String addMinutes) throws Exception{
		SimpleDateFormat formatter =new SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
		Date originalDate = formatter.parse(datetime);
		Calendar newTime = Calendar.getInstance();
		newTime.setTime(originalDate);
		newTime.add(Calendar.MINUTE,Integer.parseInt(addMinutes));//日期加n分
		Date newDate=newTime.getTime();
		String retval = formatter.format(newDate);
		return retval;
	}


	@Test
	public void test2(){
		String str = "[1\n" +
				"2021-04-16 15:56:06.0\n" +
				"backup\n" +
				"baseline\n" +
				"1, 2\n" +
				"2021-04-16 15:56:19.333774\n" +
				"create\n" +
				"/root/work/test/monitor2/i2-7053-0/aa_0.txt\n" +
				"1, 3\n" +
				"2021-04-16 15:56:19.333791\n" +
				"setattr\n" +
				"/root/work/test/monitor2/i2-7053-0/aa_0.txt\n" +
				"1, 4\n" +
				"2021-04-16 15:56:19.333833\n" +
				"write\n" +
				"/root/work/test/monitor2/i2-7053-0/aa_0.txt, off 0, len 1024\n" +
				"1, 5\n" +
				"2021-04-16 15:56:53.812237\n" +
				"write\n" +
				"/root/work/test/monitor2/i2-7053-0/aa_0.txt, off 0, len 1024\n" +
				"1]";
		String expectedStr = "setattr\n/root/work/test/monitor2/i2-7053-0/aa_0.txt";
		boolean result = str.contains(expectedStr);
		System.out.println(result);
	}
}
