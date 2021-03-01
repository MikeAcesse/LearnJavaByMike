package com.imooc.impl;

import com.imooc.IUserCredential;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/2/26 12:03
 */
public class UserCredentialImpl implements IUserCredential {
	@Override
	public String verifyUser(String username) {
		if ("admin".equals(username)) {
			return "系统管理员";
		} else if("manager".equals(username)) {
			return "用户管理员";
		}
		return "普通会员";
	}
}
