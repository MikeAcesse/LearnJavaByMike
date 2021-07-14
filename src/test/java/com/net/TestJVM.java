package com.net;

import org.junit.Test;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/7/14 17:00
 */
public class TestJVM {
	@Test
	public void test1(){
		MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
		System.out.println("堆内存信息： "+memoryMXBean.getHeapMemoryUsage());
		System.out.println("方法区内存信息： "+memoryMXBean.getNonHeapMemoryUsage());
	}
}
