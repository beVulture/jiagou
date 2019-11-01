package com.rimi.dao;

import com.rimi.user.User;

/**
 * 操作数据的接口
 * 
 * @author
 *
 */
public interface Dao {
//	判断用户是否存在的方法
	boolean isExist(User user);

//  增加用户的方法
	void addUsers(User user);
}
