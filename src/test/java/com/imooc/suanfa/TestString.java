package com.imooc.suanfa;

import org.junit.Test;

import java.util.Stack;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/18 14:13
 */
public class TestString {
    @Test
    public void testCount() {
        String str = "SERVICE_NAME: I2-PostgreSQL\n" +
                "SERVICE_NAME: I2-nginx\n" +
                "SERVICE_NAME: I2-PHP\n" +
                "SERVICE_NAME: I2-WS\n" +
                "SERVICE_NAME: I2-Ctrlserver\n" +
                "SERVICE_NAME: I2-iaproxy";
        String searchStr = "I2-";
        int originlenght = str.length();
        String newStr = str.replace(searchStr, "");
        int newLength = newStr.length();
        int count = originlenght - newLength;
        System.out.println(count / 3);
        System.out.println(newStr);
    }

    @Test
    public void testCount2() {
        String str = "ABC123ABC";
        char searchChar = 'B';
        int count = 0;
        char[] charArray = str.toCharArray();
        for (char item : charArray
        ) {
            if (item == searchChar) {
                count++;
            }
            System.out.print("item-> " + (int) item + ", ");
            System.out.println("item-> " + item);
        }
        System.out.println(count);
    }

    @Test
    public void testCount3() {
        String str = "ABC123ABC";
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        String newStr = stringBuilder.toString();
        System.out.println(str);
        System.out.println(newStr);
    }

    @Test
    public void testCount4() {
        String str = "ABC123ABC";
        String name;
        char[] charArray = str.toLowerCase().toCharArray();
        Stack stack = new Stack();
        for (char item : charArray
        ) {
            stack.push(item);
        }
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            newStr.append(stack.pop());
        }
        System.out.println(str);
        System.out.println(newStr.toString());
    }

    @Test
    public void testCount5() {
        String str = "啊！我爱你中国！啊，我爱你故乡";
        String name;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray[i]; i++) {
            System.out.print(charArray[i] + ", ");
            System.out.print((int) charArray[i] + ", ");

        }

    }

	@Test
	public void testCount6(){
		//String str ="helloworld";
		String str ="我爱你中国";
		char a =str.charAt(0);
		System.out.println(a);
		System.out.println((int)a);
		Character b =a;
		System.out.println(b.compareTo('c'));
		Character d = 'd';
		Character e = 'd';
		System.out.println(e.compareTo(d));


	}

	@Test
	public void test7(){
		int a=1;
		long b=1;
		System.out.println(a==b);
	}

}
