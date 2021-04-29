package com.pattern.ssm.chapter2.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/29 10:45
 */
public class ProductList extends Observable {
	private List<String> productList = null ; //产品列表
	private static ProductList instance; //类唯一实例
	private ProductList(){}; //构建方法私有化

	/**
	 * 取得唯一实例
	 * @return 产品列表唯一实例
	 */
	public static ProductList getInstance(){
		if(instance == null){
			instance = new ProductList();
			instance.productList = new ArrayList<>();
		}
		return instance;
	}

	/**
	 * 增加观察者（电商接口）
	 * @param observer  观察者
	 */
	public void addProductListObserver(Observer observer){
		this.addObserver(observer);
	}

	public void addProduct(String newProduct){
		productList.add(newProduct);
		System.err.println("产品列表新增了产品： "+newProduct);
		this.setChanged(); //设置被观察对象发生了变化
		this.notifyObservers(newProduct); //通知观察者，并传递新产品
	}
}
