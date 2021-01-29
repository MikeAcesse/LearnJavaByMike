package com.imooc.thread;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/22 10:10
 */
public class TestThread7 {
	public static void main(String[] args) throws InterruptedException {
       Thread[] ts = new Thread[] {new AddStudentThread(), new DecStudentThread(), new AddTeacherThread(), new DecTeacherThread()};
		for (Thread  t:ts
		     ) {
			t.start();
		}
		for (Thread  t:ts
		) {
			t.join();
		}
		System.out.println(Counter1.studentCount);
		System.out.println(Counter1.teacherCount);
	}
}
class Counter1{
	public static final Object lock = new Object();
	public static final Object lockStudent = new Object();
	public static final Object lockTeacher = new Object();
	public static int studentCount  = 0;
	public static int teacherCount = 0;
}

class AddStudentThread extends Thread {
	public void run() {
		for (int i=0; i<10000; i++) {
			synchronized(Counter1.lockStudent) {
				Counter1.studentCount += 1;
			}
		}
	}
}

class DecStudentThread extends Thread {
	public void run() {
		for (int i=0; i<10000; i++) {
			synchronized(Counter1.lockStudent) {
				Counter1.studentCount -= 1;
			}
		}
	}
}

class AddTeacherThread extends Thread {
	public void run() {
		for (int i=0; i<10000; i++) {
			synchronized(Counter1.lockTeacher) {
				Counter1.teacherCount += 1;
			}
		}
	}
}

class DecTeacherThread extends Thread {
	public void run() {
		for (int i=0; i<10000; i++) {
			synchronized(Counter1.lockTeacher) {
				Counter1.teacherCount -= 1;
			}
		}
	}
}
