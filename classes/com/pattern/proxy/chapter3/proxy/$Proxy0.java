package com.pattern.proxy.chapter3.proxy;
public class $Proxy0 implements com.pattern.proxy.chapter3.proxy.Moveable {
 public $Proxy0(com.pattern.proxy.chapter3.proxy.Moveable m) {
 super();
 this.m = m;
 }
 private com.pattern.proxy.chapter3.proxy.Moveable m;
 @Override
 public void move() {
 long starttime = System.currentTimeMillis();
 System.out.println("汽车开始行驶。。。");
 m.move();
 long endtime = System.currentTimeMillis();
 System.out.println("汽车结束行驶。。。汽车行驶时间：" 
 +(endtime -starttime) + " 毫秒！");
 }
}