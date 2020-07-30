package com.lanyou;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/7/24 12:11
 */
public class dateTest {
	@Test
	public void test1(){
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_MONTH,0);
		System.out.println(cal.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String datestr=sdf.format(cal.getTime());
		System.out.println(datestr);
	//	String combinDate = 2020-07-24 01:28:0


	}

     @Test
	public void  getCurrentDate(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
	     System.out.println(sdf.format(date));
	}

	@Test
	public void testswitch(){

	}
}
