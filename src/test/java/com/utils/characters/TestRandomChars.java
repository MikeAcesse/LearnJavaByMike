package com.utils.characters;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;

import java.util.Random;

/**
 *
 * https://blog.csdn.net/lianghecai52171314/article/details/108528227?utm_term=randomstringutils%E4%BD%BF%E7%94%A8&utm_medium=distribute.pc_aggpage_search_result.none-task-blog-2~all~sobaiduweb~default-0-108528227&spm=3001.4430
 * @author fanzk
 * @version 1.8
 * @date 2021/5/14 9:58
 */
public class TestRandomChars {


	// //生成随机[a-z,A-Z]字符串，包含大小写
	@Test
	public void testRandomAlphabetic(){
		String filename = RandomStringUtils.randomAlphabetic(16);
		System.out.println(filename);
		System.out.println(filename.length());
	}

	@Test
	public void test(){
		String random3 = RandomStringUtils.randomAlphanumeric(15);
		System.out.println(random3);
		System.out.println(random3.length());
	}

	/**
	 * https://blog.csdn.net/lianghecai52171314/article/details/108528227
	 */
	@Test
	public void test2(){
		//使用指定的字符生成5位长度的随机字符串，第二个参数如果NULL，则使用所有字符集
		String random2 = RandomStringUtils.random(16, new char[]{'a', 'b', 'c', 'd', 'e', 'f', '1', '2', '3'});
		System.out.println(random2);

	}

	public String getRandomInvalidateString(int length){
		String str = "!@#$%^&*()+=[]{}\\|;:'\",<>?/中！￥【】、|，《。》、？";
		Random random = new Random();
		char c =str.charAt(random.nextInt(str.length()));
		String randomstr =RandomStringUtils.randomAlphanumeric(15);
		StringBuffer sb = new StringBuffer(randomstr);
		sb.append(c);
		return sb.toString();
	}

	@Test
	public void test3(){
		String name = getRandomInvalidateString(15);
		System.out.println(name.length());
		System.out.println(name);
	}
}
