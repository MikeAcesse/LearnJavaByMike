package com.pattern.ssm.chapter2.builder;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/29 13:49
 */
public class TicketHelper {
	public void buildAdult(String info){
		System.err.println("构建成人票逻辑： "+info);
	}

	public void buildChildrenForSeat(String info){
		System.err.println("构建有座儿童票逻辑： "+info);
	}

	public void buildChildrenNoSeat(String info){
		System.err.println("构建无座儿童票逻辑：" + info);
	}

	public void buildElderly(String info){
		System.err.println("构建有老年人票逻辑: "+info);
	}
	public void buildSoldier(String info){
		System.err.println("构建军人及其家属逻辑:"+info);
	}
}
