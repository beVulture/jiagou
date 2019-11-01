package com.rimi.serviceimpl;

import com.rimi.dao.Dao;
import com.rimi.daoimpl.DaoImpl;
import com.rimi.service.UserService;
import com.rimi.user.User;
import com.rimi.util.Tool;


public class UserServiceImpl implements UserService {
	public Dao dao = new DaoImpl();

	@Override
	public void logIn() {
		System.out.println("请输入用户名");
		String name = Tool.inputString();
		System.out.println("请输入密码");
		String password = Tool.inputString();
		if (dao.isExist(new User(name, password))) {
			System.out.println("登陆成功");
		} else {
			System.out.println("账号密码错误");
		}
		
	}

	@Override
	public void register() {
		System.out.println("请输入用户名");
		String name = Tool.inputString();
		System.out.println("请输入密码");
		String password = Tool.inputString();
		dao.addUsers(new User(name, password));
		System.out.println("注册成功");
	}

}
