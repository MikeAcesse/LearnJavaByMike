package com.threads.chapter2.th08;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/7 10:26
 */
public class TestUnCheck {
	public static void main(String[] args) {
//		User user = new User();
//		user.setAge(-20);
//		System.out.println(user.getAge());

		CheckUser checkUser = new CheckUser();
		try {
			checkUser.setAge(-20);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("fan..."+e.toString());
		}
		System.out.println(checkUser.getAge());
		checkUser.setScores(-100);
		System.out.println(checkUser.getScores());
	}
}
class User{
	private int age;
	public void setAge(int age){
		if(age < 0){
			RuntimeException e = new RuntimeException("Runtime exception message");
			throw e;
		}
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}
class CheckUser{
	private int age;
	private int scores;

	public int getScores() {
		return scores;
	}

	public void setScores(int scores) {
		if(scores < 0){
			Exception e = new Exception("score value is "+scores+",请输入合理的值");
			try {
				throw e;
			} catch (Exception ex) {
				ex.printStackTrace();
				System.out.println("e is "+e);
			}
		}
		this.scores = scores;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if(age < 0){
			Exception e = new Exception("Exception message");
			throw e;
		}
		this.age = age;
	}
}
