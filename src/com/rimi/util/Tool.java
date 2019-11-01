package com.rimi.util;

import java.util.Scanner;

/**
 * 获取用户输入的工具
 * 
 * @author
 *
 */
public class Tool {
	static Scanner scanner = new Scanner(System.in);

//	获取用户输入的整数
	public static int inputInt() {
		return scanner.nextInt();
	}

//	获取用户输入的字符串
	public static String inputString() {
		return scanner.next();
	}
}
