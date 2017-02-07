/**
 * Project Name: questTestDemo
 * File Name: Singleton1.java
 * Package Name: com.quest.designPattern.SingletonPattern
 * Date: 2017年2月5日下午5:29:59 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.SingletonPattern;
/** 
 * @ClassName: Singleton1
 * @Description: 饿汉式（eagerly）（可以直接有效的避免多线程带来的问题）
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月5日 下午5:29:59
 */
public class Singleton1 { 
	//JVM第一次加载这个类的时候，就实例化了个对象
	private static Singleton1 singleton1 = new Singleton1();

	//编译后即实例化该对象
	private Singleton1() {
	}
	//每次调用的时候，必然可以得到该对象，不存在线程安全问题
	public static Singleton1 getInstance(){
		return singleton1;
	}
	
}
