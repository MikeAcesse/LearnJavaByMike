package com.regular;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/1/25 16:39
 */
public class TestRegular02 {
	@Test
	public void test1(){
		String Regex = "\\w(\\d\\d)(\\w+)";
		String TestStr = "A22happy11";
		String TestStr2 = "f88kang222";
		Pattern p = Pattern.compile(Regex);
		Matcher matcher = p.matcher(TestStr);
		if(matcher.find()){
			System.out.println("group():"+matcher.group());
			int gc = matcher.groupCount();
			System.out.println(gc);
			for (int i=0;i<=gc;i++){
				System.out.println("group "+i+" :"+matcher.group(i));
			}
		}


		System.out.println("*********************");
		matcher.reset(TestStr2);
		if(matcher.find()){
			System.out.println("group():"+matcher.group());
			int gc = matcher.groupCount();
			System.out.println(gc);
			for (int i=0;i<=gc;i++){
				System.out.println("group "+i+" :"+matcher.group(i));
			}
		}

	}

	@Test
	public void testStart(){
		//创建一个Matcher,使用Matcher.start()方法
		String candidateString = "My name is Bond. James Bond.";
		System.out.println("candidateString 的length = "+candidateString);
		System.out.println("candidateString的第一个Bond 开始的下标："+candidateString.indexOf("Bond"));
		System.out.println("candidateString的最后一个Bond 开始的下标："+candidateString.lastIndexOf("Bond"));
		String matcherHelper[] = {"          ^","                      ^"};
		Pattern p = Pattern.compile("Bond");
		Matcher matcher = p.matcher(candidateString);
		//找到第一个‘bond’的开始下标
        matcher.find();
        int startIndex = matcher.start();
		System.out.println(candidateString);
		System.out.println(matcherHelper[0]+startIndex);
		//找到第二个‘bond’的开始下标
		matcher.find();
		int nextIndex = matcher.start();
		System.out.println(candidateString);
		System.out.println(matcherHelper[1]+nextIndex);
	}

	@Test
	public  void testGroup(){
		//创建一个Pattern
		Pattern p = Pattern.compile("Bond");
		//创建一个Matcher, 以便使用group()方法
		String candidateString = "My name is Bond. James Bond.";
		Matcher matcher = p.matcher(candidateString);
		matcher.find();
		System.out.println(String.format("group匹配的字符串 : %s",matcher.group()));
		System.out.println(String.format("匹配的开始位置 : %d", matcher.start()));
		System.out.println(String.format("匹配的结束位置 : %d", matcher.end()));

		System.out
				.println("---再次使用matcher.find()方法，看看matcher中group、start、end方法的效果");
		matcher.find();
		System.out.println(String.format("group匹配的字符串 : %s",matcher.group()));;
		System.out.println(String.format("匹配的开始位置 : %d", matcher.start()));
		System.out.println(String.format("匹配的结束位置 : %d", matcher.end()));
		System.out.println(String.format("candidateString字符串的长度 : %d", candidateString.length()));

	}


	@Test
	public void testID_card(){
		//测试是否为合法的身份证号
		String[] strs = { "130681198712092019", "13068119871209201x",
				"13068119871209201", "123456789012345", "12345678901234x",
				"1234567890123" };
		//准备正则表达式（身份证有15位和18位这两种，身份证的最后一位可能是字母）
		String regex ="(\\d{14}\\w)|(\\d{17}\\w)";
		//准备开始匹配，判断所有的输入是否是正确
		Pattern regular = Pattern.compile(regex); //创建匹配的规则Patter
		StringBuilder sb = new StringBuilder();
		//遍历所有要匹配的字符串
		for (int i = 0; i < strs.length; i++) {
			Matcher matcher = regular.matcher(strs[i]); //创建一个Matcher
			sb.append("身份证： ");
			sb.append(strs[i]);
			sb.append("  匹配：");
			sb.append(matcher.matches());
			System.out.println(sb.toString());
			sb.delete(0,sb.length()); //清空StringBuilder的方法

		}

		GetBirthDay(strs);


	}

	private void GetBirthDay(String[] strs){
		System.out.println("准备开始获取出生日期");
		//准备验证规则
		Pattern BirthDayRegular = Pattern.compile("(\\d{6})(\\d{8})(.*)");
		// .*连在一起就意味着任意数量的不包含换行的字符
		Pattern YearMonthDayRegular = Pattern
				.compile("(\\d{4})(\\d{2})(\\d{2})");
		for (int i = 0; i < strs.length; i++) {
			Matcher matcher = BirthDayRegular.matcher(strs[i]);
			if(matcher.matches()){
				Matcher matcher1 = YearMonthDayRegular.matcher(matcher.group(2));
				if(matcher1.matches()){
					System.out.println(strs[i]+"中的出生年月日分解为：年->"+matcher1.group(1)+" 月->"+matcher1.group(2)+" 日->"+matcher1.group(3));
				}
			}

		}
	}


	@Test
	public void testMatchers(){
		String Regex = "\\w(\\d\\d)(\\w+)";
		String TestStr = "A22happy11";
		Pattern p = Pattern.compile(Regex);
		Matcher matcher = p.matcher(TestStr);

		if(matcher.find()){
			System.out.println("group():"+matcher.group());
			int gc = matcher.groupCount();
			System.out.println(gc);
			for (int i=0;i<=gc;i++){
				System.out.println("group "+i+" :"+matcher.group(i));
			}
		}
		System.out.println(matcher.matches());

	}


	@Test
	public void testRegexMatches(){
		String Regex = "a*b";
		String input = "aabfooaabfooabfoobkkk";
		String repalce = "-";
		Pattern p = Pattern.compile(Regex);
		Matcher m = p.matcher(input);
		StringBuffer sb = new StringBuffer();
		while(m.find()){
			m.appendReplacement(sb,repalce);
		}
		m.appendTail(sb);
		System.out.println(sb.toString());


	}
     @Test
	public void testRegexDog(){
	Pattern p = Pattern.compile("cat");
	Matcher m = p.matcher("one cat two cats in the yard");
	StringBuffer sb = new StringBuffer();
	while (m.find()) {
		m.appendReplacement(sb, "fan");
	}
	m.appendTail(sb);
	System.out.println(sb.toString());


	}
	@Test
	public void testRegexSyntax() {
		String REGEX = "dog";
		String INPUT = "The dog says meow " + "All dogs say meow.";
		String REPLACE = "cat";

		try {
			Pattern pattern = Pattern.compile(REGEX);
			Matcher matcher = pattern.matcher(INPUT);
			INPUT = matcher.replaceAll(REPLACE);
			System.out.println(INPUT);
		} catch (PatternSyntaxException e) {
			System.out.println("PatternSyntaxException: ");
			System.out.println("Description: " + e.getDescription());
			System.out.println("Index: " + e.getIndex());
			System.out.println("Message: " + e.getMessage());
			System.out.println("Pattern: " + e.getPattern());
		}
	}



	@Test
	public void testRegexReplaceFirst() {
		String REGEX = "dog";
		String INPUT = "The dog says meow " + "All dogs say meow.";
		String REPLACE = "cat";

		try {
			Pattern pattern = Pattern.compile(REGEX);
			Matcher matcher = pattern.matcher(INPUT);
			INPUT = matcher.replaceFirst(REPLACE);
			System.out.println(INPUT);
		} catch (PatternSyntaxException e) {
			System.out.println("PatternSyntaxException: ");
			System.out.println("Description: " + e.getDescription());
			System.out.println("Index: " + e.getIndex());
			System.out.println("Message: " + e.getMessage());
			System.out.println("Pattern: " + e.getPattern());
		}
	}

	@Test
	public void testRegexSecond() {
		String REGEX = "foo";
		String INPUT = "fooooooooooooooooo";
		String INPUT2 = "ooooofoooooooooooo";
		String INPUT3 = "foo";
		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(INPUT);
		Matcher matcher2 = pattern.matcher(INPUT2);
		Matcher matcher3 = pattern.matcher(INPUT3);
		System.out.println(matcher.lookingAt());
		System.out.println(matcher.matches());
		System.out.println(matcher2.lookingAt());
		System.out.println(matcher2.find());
		System.out.println(matcher2.matches());
		System.out.println(matcher3.matches());

	}

}


