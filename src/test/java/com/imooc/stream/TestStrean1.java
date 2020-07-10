package com.imooc.stream;

import org.junit.Test;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/13 15:37
 */
public class TestStrean1 {

    @Test
	public void test(){
    	String srcDir = "/root/work/test/monitor13/,/root/work/test/monitor13/";
	    String[] subSrcDirs = srcDir.split(",");
	    StringBuilder sb=new StringBuilder();
	    for (int i = 0; i < subSrcDirs.length; i++) {
		    if(i==subSrcDirs.length-1){
			    sb.append(subSrcDirs[i]).append("i2-1202").append("/");
		    }else{
			    sb.append(subSrcDirs[i]).append("i2-1202").append("/").append(",");
		    }
	    }
	    System.out.println(sb.toString());
    }

	@Test
	public void test2(){
		String srcDir = "/root/work/test/monitor13/,/root/work/test/monitor13/";
		String[] subSrcDirs = srcDir.split(",");
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < subSrcDirs.length; i++) {
			sb.append(subSrcDirs[i]).append("i2-1202").append("/").append(",");
		}
		System.out.println(sb.toString());
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString());
	}
	@Test
	public void test3(){
		String srcDir = "/root/work/test/monitor13/,/root/work/test/monitor13/";
		String[] subSrcDirs = srcDir.split(",");
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < subSrcDirs.length; i++) {
			sb.append(subSrcDirs[i]).append("i2-1202").append("/").append(",");
		}
		String astr =sb.toString();
		String dir = astr.replace(","," ");
		System.out.println(dir);

	}

	@Test
	public void test4(){
		String srcDir = "/root/work/test/monitor13/, ";
		String[] subSrcDirs = srcDir.split(",");
		System.out.println(subSrcDirs);

	}
}
