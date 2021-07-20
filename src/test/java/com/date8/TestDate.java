package com.date8;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;


/**
 * Instant         时间戳
 * Duration        持续时间、时间差
 * LocalDate       只包含日期，比如：2018-09-24
 * LocalTime       只包含时间，比如：10:32:10
 * LocalDateTime   包含日期和时间，比如：2018-09-24 10:32:10
 * Peroid          时间段
 * ZoneOffset      时区偏移量，比如：+8:00
 * ZonedDateTime   带时区的日期时间
 * Clock           时钟，可用于获取当前时间戳
 * java.time.format.DateTimeFormatter      时间格式化类
 */

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/22 15:57
 * 在java8 之前，日期时间ApI 一致被开发者诟病，包括java.util.Date是可变类型，SimpleDateFormat是非线程安全的。故
 * java8 引入了一套全新的日期时间处理API，新的API基于ISO标准日历系统
 *
 *
 *
 */
public class TestDate {
	/**
	 * 　Java 8中的 LocalDate 用于表示当天日期。和java.util.Date不同，它只有日期，不包含时间。
	 */
	@Test
	public void test1(){
		LocalDate ld = LocalDate.now();   //localDate是包括日期，不包括时间
		System.out.println("当前日期="+ld);
	}


	/**
	 * 　调用工厂方法LocalDate.of()创建任意日期， 该方法需要传入年、月、日做参数，
	 * 返回对应的LocalDate实例。这个方法的好处是没再犯老API的设计错误，比如年度起始于1900，月份是从0开始等等
	 */
	@Test
	public void test2(){
		LocalDate date = LocalDate.of(2000,1,1);
		System.out.println("千禧年="+date);
	}

	/**
	 *  获取年月日信息
	 */
	@Test
	public void test3(){
		LocalDate ld = LocalDate.now();
		System.out.printf("年=%d, 月=%d, 日=%d",ld.getYear(),ld.getMonthValue(),ld.getDayOfMonth());

	}

	/**
	 * 比较两个日期是否相等
	 */
	@Test
	public void test4(){
       LocalDate now = LocalDate.now();
       LocalDate Date = LocalDate.of(2021,4,22);
		System.out.println(now.equals(Date));
	}


	/**
	 * 获取当前时间，Java8 的LocalTime用于表示当天时间，和Java.util.Date不同，它只有时间，不包括时期
	 */
	@Test
	public void test5(){
		LocalTime time = LocalTime.now();
		  System.out.println("当前时间是："+time);
		  Date date = new Date();
		System.out.println(date);
	}

	@Test
	public void test6(){
		LocalTime time = LocalTime.now();
		System.out.println("当前时间是："+time);
		Date date = new Date();
		System.out.println(date);
	}

	@Test
	public void test7(){

		///时间增量
		LocalTime time = LocalTime.now();
		System.out.println("time = "+time);
		LocalTime newTime = time.plusHours(2);
		System.out.println("newTime= "+newTime);

		//日期增量
		LocalDate date = LocalDate.now();
		System.out.println("date = "+date);
		LocalDate newDate = date.plus(2, ChronoUnit.WEEKS);
		System.out.println("newDate = "+newDate);

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDatetime="+localDateTime);
		LocalDateTime newLocalDateTime = localDateTime.plusHours(6);
		System.out.println("newLocalDatetime: "+newLocalDateTime);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formateStr = newLocalDateTime.format(formatter);
		System.out.println(formateStr);


	}

	@Test
	public void test8(){
		//日期比较
		LocalDate now = LocalDate.now();
		LocalDate date1 = LocalDate.of(2000,1,1);
		if(now.isAfter(date1)){
			System.out.println("迁徙之年过去了");
		}

		LocalDate date2 = LocalDate.of(2025,1,1);
		if(now.isBefore(date2)){
			System.out.println(date2+"还没有来");
		}

	}

	/**
	 * 创建带有时区的日期和时间
	 * java8 不仅分离了日期和时间，也把时区分离出来了，现在有一系列单独的类如ZoneId来处理特定时区，ZoneDateTime类
	 * 表示某时区下的时间
	 */
	@Test
	public void test9(){

		//上海时间
		ZoneId shanghaiZoneId = ZoneId.of("Asia/Shanghai");
		ZonedDateTime shanghaiDateTime = ZonedDateTime.now(shanghaiZoneId);
		System.out.println(shanghaiDateTime);
		//东京时间
		ZoneId tokyoZoneId = ZoneId.of("Asia/Tokyo");
		ZonedDateTime tokyoZonedDateTime = ZonedDateTime.now(tokyoZoneId);
		System.out.println(tokyoZonedDateTime);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println("上海时间: " + shanghaiDateTime.format(formatter));
		System.out.println("东京时间: " + tokyoZonedDateTime.format(formatter));
	}

	@Test
	public void test10(){

		//解析日期
		String dateText = "20190912";
		LocalDate date = LocalDate.parse(dateText,DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("格式化之后的日期是： "+date);

		//格式化日期
		dateText = date.format(DateTimeFormatter.ISO_DATE);
		System.out.println(dateText);
	}

	@Test
	public void test11(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		//日期转字符串
		LocalDateTime now = LocalDateTime.now();
		String nowText = now.format(formatter);
		System.out.println(nowText);

		//字符串转日期时间
		String dateTimeText = "1999-12-31 23:59:59";
		LocalDateTime dateTime = LocalDateTime.parse(dateTimeText,formatter);
		System.out.println(dateTime);
	}

	@Test
	public void test12(){
		String str1 = "4489f961-0d87-4f46-b507-751f93df2931_snap_2021-04-30_17-43-20";
		int index = str1.lastIndexOf("_",str1.length()-10);
		String sus = str1.substring(index+1);
		System.out.println(sus);
		String str2 = "38785ddf-2b49-4716-beae-6cf810427b9f_snap_2021-04-30_17-35-19";
		int index1 = str1.lastIndexOf("_",str1.length()-10);
		String sus1 = str2.substring(index1+1);
		System.out.println(sus1);
	}

	@Test
	public void test13(){
		String actual = "20210720_135422";
		String expected = "20210720_134545";
		String expected1 = "20210720_134723";
		boolean result =  expected.compareTo(actual) <0;
		boolean result1 =  expected1.compareTo(actual) <0;
		System.out.println(result);
		System.out.println(result1);
	}
}
