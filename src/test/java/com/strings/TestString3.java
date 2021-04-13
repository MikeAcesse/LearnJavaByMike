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
}
