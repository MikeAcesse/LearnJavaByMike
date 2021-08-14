package com.utils.calendar;

import info2soft.qa.common.util.TimeUtil;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/28 13:50
 */
public class TestJDK7 {
	@Test
	public void test1() throws ParseException {
		String startTime = TimeUtil.currentDateTime("yyyy-MM-dd HH:mm");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date = df.parse(startTime);
//		Long micSeconds = date.getTime()+120 * 1000;
//		startTime = df.format(micSeconds);
//		System.out.println(startTime);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		String str1 = df.format(calendar.getTime());
		System.out.println(str1);
		calendar.add(Calendar.MINUTE,-5);
		calendar.add(Calendar.HOUR_OF_DAY,-5);
		String str = df.format(calendar.getTime());
		System.out.println(str);
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		String[] dateStr = str.split(" ");
		System.out.println(dateStr);


	}
}
