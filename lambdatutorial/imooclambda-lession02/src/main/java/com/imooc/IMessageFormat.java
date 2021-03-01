package com.imooc;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/2/26 11:40
 * 消息传输格式化转换接口
 */
@FunctionalInterface
public interface IMessageFormat {
	/**
	 * 消息转换方法
	 * @param message 要转换的消息
	 * @param format 转换的格式【xml/json..】
	 * @return 返回转换后的数据
	 */
	String format(String message,String format);
	//boolean  test();
	String toString();

	static boolean verifyMessage(String msg){
		if(msg != null){
			return true;
		}
		return false;
	}

}
