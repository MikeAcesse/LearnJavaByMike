package com.imooc.impl;

import com.imooc.IMessageFormat;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/3/1 9:11
 */
public class MessageFormatImpl implements IMessageFormat {
	@Override
	public String format(String message, String format) {
		System.out.println("消息转换...");
		return message;
	}
}
