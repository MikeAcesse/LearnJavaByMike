package com.net;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/7/14 16:50
 */
public class TestIP {
	@Test
	public void testLocalHost()  {
		InetAddress ip ;
		try {
			ip = InetAddress.getLocalHost();
			String localname = ip.getHostName();
			String localip = ip.getHostAddress();
			System.out.println("本机名："+localname);
			System.out.println("本机ip地址："+localip);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
