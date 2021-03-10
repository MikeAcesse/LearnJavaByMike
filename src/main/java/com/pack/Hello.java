package com.pack;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/7/31 17:17
 */
public class Hello {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.sayHello("fanzhikang,HelloWorld!");
    }

    private void sayHello(String s) {
        System.out.println("nihao, " + s);
    }
}
