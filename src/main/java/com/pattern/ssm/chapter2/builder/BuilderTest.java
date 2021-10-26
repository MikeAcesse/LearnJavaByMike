package com.pattern.ssm.chapter2.builder;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/29 13:57
 */
public class BuilderTest {
	public static void main(String[] args) {
		TicketHelper helper = new TicketHelper();
		helper.buildAdult("成人票");
		helper.buildChildrenForSeat("有座儿童");
		helper.buildChildrenNoSeat("无座儿童");
		helper.buildElderly("老人票");
		helper.buildSoldier("军人票");
		Object ticket = TicketBuilder.builder(helper);

	}
}
