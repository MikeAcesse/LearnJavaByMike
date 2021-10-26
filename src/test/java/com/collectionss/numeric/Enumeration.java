package com.collectionss.numeric;

import org.junit.Test;

import java.util.Random;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/14 11:01
 */
public class Enumeration {
    enum CompressionType{
	    EXTREME("极速压缩",1),COMMOM("普通压缩",2),RAPID("快速压缩",3),EQUILIBRIUM("均衡压缩",4);

	    private String name;
	    private int zipValue;
	    private CompressionType(String name, int zipValue) {
	    	this.name =name;
	    	this.zipValue = zipValue;
	    }

	    public String getName() {
		    return this.name;
	    }

	    public int getZipValue() {
		    return zipValue;
	    }
    }

    @Test
	public void test1(){
	    CompressionType[] arr = CompressionType.values();
	    System.out.println(arr);
	    String name = CompressionType.COMMOM.getName();
	    System.out.println(name);
	    System.out.println(CompressionType.COMMOM.getZipValue());
    }

    public CompressionType getRandomCompressionType(){
	    CompressionType[] arr = CompressionType.values();
	    int number = new Random().nextInt(arr.length);
	    return  arr[number];
    }

    @Test
	public void test2(){
	    CompressionType type = getRandomCompressionType();
	    System.out.println(type.getName());
    }


}
