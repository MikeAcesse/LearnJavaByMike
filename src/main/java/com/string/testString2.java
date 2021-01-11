package com.string;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/12/3 15:42
 */
public class testString2 {
	public static void main(String[] args) {
		String copydir = "d:\\work\\test\\";
		String fileName ="/etc/fan";
		String cmd = "echo \"mount -t nfs 172.20.64.100:/nfs/auto_lin3/cm_nfs/ " + copydir+" \" >> "+fileName;
		System.out.println(cmd);
	}
}
