package com.pattern.ligang.StructuralPattern02.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/10/21 18:10
 */
public class FlyweightFactory {
	private static Map flyweights = new HashMap();
	public FlyweightFactory(String arg){
		flyweights.put(arg,new FlyweightImpl());
	}

	public static Flyweight getFlyweight(String key){
		if(flyweights.get(key) == null){
			flyweights.put(key,new FlyweightImpl());
		}
		return (Flyweight) flyweights.get(key);
	}

	public static int getSize(){
		return flyweights.size();
	}
}
