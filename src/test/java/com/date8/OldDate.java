package com.date8;

import org.junit.Test;

import java.util.Calendar;
import java.util.Locale;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/9/7 18:02
 */
public class OldDate {
	@Test
	public void test1(){
		Calendar calendar =Calendar.getInstance();
		String displayName = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.getDefault());
		System.out.println(displayName);
	}
}
