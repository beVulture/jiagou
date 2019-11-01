package com.rimi.daoimpl;

import com.rimi.dao.Dao;
import com.rimi.data.DataBase;
import com.rimi.user.User;

/**
 * 实现操作数据接口的类
 * 
 * @author
 *
 */
public class DaoImpl implements Dao {
//	重写判断的方法
	@Override
	public boolean isExist(User user) {
//		传入的用户数据
		User[] users = DataBase.users;
		int userNumbers = DataBase.userNumbers;
//		判断用输入是否与数据库数据存在
		for (int i = 0; i < userNumbers; i++) {
			if (users[i].getName().equals(user.getName()) && users[i].getPassword().equals(user.getPassword())) {
				return true;
			}
		}
		return false;
	}

//	重写增加用户的方法
	@Override
	public void addUsers(User user) {
		User[] users = DataBase.users;
		users[DataBase.userNumbers++] = user;
	}

}
