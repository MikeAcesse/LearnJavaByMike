package com.date8;

import net.sf.cglib.core.Local;
import org.junit.Test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.Locale;


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
	private Object DateTime;

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

		LocalDate date1 = LocalDate.of(2021,3,8);
		System.out.println("千禧年="+date1);
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
       LocalDate Date2 = LocalDate.of(2021,9,8);
		System.out.println(now.equals(Date));
		System.out.println(now.equals(Date2));
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
		LocalTime time = LocalTime.of(11,30,25);
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
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(newTime.format(timeFormatter));
		System.out.println(newTime.getHour());
//		System.out.println(newTime.getMinute());
//		System.out.println(newTime.getNano());
//		System.out.println(newTime.getSecond());
//		System.out.println(newTime.plusMinutes(10));

		//日期增量
		LocalDate date = LocalDate.now();
		System.out.println("date = "+date);
		LocalDate newDate = date.plus(2, ChronoUnit.WEEKS);
		System.out.println("newDate = "+newDate);
		System.out.println(newDate.plusWeeks(1));

//		LocalDateTime localDateTime = LocalDateTime.now();
//		System.out.println("localDatetime="+localDateTime);
//		LocalDateTime newLocalDateTime = localDateTime.plusHours(6);
//		System.out.println("newLocalDatetime: "+newLocalDateTime);
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//		String formateStr = newLocalDateTime.format(formatter);
//		System.out.println(formateStr);


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

	@Test
	public void test18(){
		//日期比较
		LocalTime now = LocalTime.now();
		LocalTime time1 = LocalTime.of(6,25,30);
		if(now.isAfter(time1)){
			System.out.println(now +" is 过去了");
		}

		LocalTime time2 = LocalTime.of(23,25,30);
		if(now.isBefore(time2)){
			System.out.println(time2+"还没有来");
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

	public int calculateTimeDifference(String fromDateTime,String toDateTime){
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		/*小时差*/
		int hours=0;
		try {
			Date fromDate2 = simpleFormat.parse(fromDateTime);
			Date toDate2 = simpleFormat.parse(toDateTime);
			long from2 = fromDate2.getTime();
			long to2 = toDate2.getTime();
			hours = (int) ((to2 - from2) / (1000 * 60 * 60));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("两个时间之间的小时差为：" + hours);
		return hours;
	}

	@Test
	public void test14(){
		String from = "2021-07-26 19:38:38";
		String to = "2021-07-26 21:38:31";
		int num = calculateTimeDifference(from,to);
		System.out.println(num);
	}


	/**
	 * java 中%d 和 %f 分别用来表示输出时，替换整型输出和浮点型输出的占位符
	 * 这里的%n是换行的格式字符串,只能用在print输出语句中, 而\n是回车字符, 可以用在所有的字符串中.
	 */
	@Test
	public void test15(){

		int a = 28;
		float b = 13.0f;
		System.out.printf("整数是：%d%n小数是：%f",a,b);
	}

	@Test
	public void test16(){
		LocalDate ld = LocalDate.now();
		System.out.println(ld.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault()));
	}



//	public LocalDateTime getLocalDateTime(String dateTimeText, long amountToAdd, TemporalUnit unit){
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//		LocalDateTime dateTime = LocalDateTime.parse(dateTimeText,formatter);
//		LocalDateTime dateTime2 = dateTime.plus(amountToAdd,unit);
//		return dateTime2;
////		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
//////		return formatter2.format(dateTime2);
//
//	}

	public LocalDateTime getLocalDateTime(String dateTimeText, long amountToAdd, TemporalUnit unit){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.parse(dateTimeText,formatter);
		return dateTime.plus(amountToAdd,unit);
	}

	public String getLocalTime(String dateTimeText, long amountToAdd, TemporalUnit unit){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		LocalDateTime localDateTime = getLocalDateTime(dateTimeText,amountToAdd,unit);
		return LocalTime.of(localDateTime.getHour(),localDateTime.getMinute()).format(formatter);
	}

	public String getLocalDate(String dateTimeText, long amountToAdd, TemporalUnit unit){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime localDateTime = getLocalDateTime(dateTimeText,amountToAdd,unit);
		return LocalDate.of(localDateTime.getYear(),localDateTime.getMonth(),localDateTime.getDayOfMonth()).format(formatter);
	}

	public String getLocalDateTimeString(String dateTimeText, long amountToAdd, TemporalUnit unit){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.parse(dateTimeText,formatter);
		return dateTime.plus(amountToAdd,unit).format(formatter);
	}

	@Test
	public void test17(){
		LocalDateTime text = getLocalDateTime("2021-09-08 12:02:00",10,ChronoUnit.MINUTES);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(formatter2.format(text));

		LocalDateTime text1 = getLocalDateTime("2021-09-08 12:02:44",1,ChronoUnit.WEEKS);
		System.out.println(text1);

		String text2 = getLocalTime("2021-09-08 12:02:25",1,ChronoUnit.HOURS);
		System.out.println(text2);

		String text3 = getLocalDate("2021-09-08 12:02:25",2,ChronoUnit.DAYS);
		System.out.println(text3);

		String text4 = getLocalDateTimeString("2021-09-08 12:02:25",10,ChronoUnit.YEARS);
		System.out.println(text4);
	}

	@Test
	public void test19() throws InterruptedException {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime.getYear());
		System.out.println(localDateTime.getDayOfMonth());
		Thread.sleep(1000);
		LocalDateTime localDateTime1 = LocalDateTime.now();
		System.out.println(localDateTime1);
		System.out.println(localDateTime.equals(localDateTime1));

		System.out.println(LocalDate.of(LocalDateTime.now().getYear(),LocalDateTime.now().getMonth(),1));
		System.out.println(LocalDate.of(LocalDateTime.now().getYear(),LocalDateTime.now().getMonth(),1).toString()+" 12:30:00");

	}
}
