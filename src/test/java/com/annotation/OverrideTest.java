package com.annotation;

/**
 * @author fanzk
 * @version 1.8
 *
 */
public class OverrideTest {
	@Override
	public String toString(){
		return "Override toString";
	}

	//@Override
	public String getString(){
		return "get String";
	}

	public static void main(String[] args) {
		System.out.println("helloWorld");
	}
}
