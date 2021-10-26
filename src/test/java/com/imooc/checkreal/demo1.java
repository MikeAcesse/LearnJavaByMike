package com.imooc.checkreal;

/**
 * a++是先进行取值，然后进行自增运算.
 * ++a是先进行自增运算，然后进行取值.
 */
public class demo1 {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("初始化a: "+a);
        int b = a++;
        System.out.println("a++运算："+b);
        System.out.println("a++运算结束，a值： "+a);
        a = 0;
        System.out.println("初始化a: "+a);
        int c = ++a;
        System.out.println("++a运算："+c);
        System.out.println("++a运算结束，a值："+a);
    }
}
