package com.pattern.csdn.adapter;

import java.sql.SQLOutput;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/13 11:05
 */
public class Client {
	public static void main(String[] args) {
		BioRobot robot = new BioRobot(); //首先我们需要一个机器人
		robot.cry();
		robot.move();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		Dog dog = new Dog(); // 和一只狗
		//将这是狗包装到机器人中，使其有点儿像机器人
		Robot dogRobot = new DogAdapter(dog);
		//然后是机器人叫和跑
		System.out.println("BioRob cry.....");
		dogRobot.cry();
		dogRobot.move();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		Bird bird = new Bird();
		Robot birdRobot = new BirdAdapter(bird);
		birdRobot.cry();
		birdRobot.move();


	}

}
