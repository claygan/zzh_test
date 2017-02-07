/**
 * Project Name: questTestDemo
 * File Name: Sinlgeton2.java
 * Package Name: com.quest.designPattern.SingletonPattern
 * Date: 2017年2月5日下午5:35:10 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.SingletonPattern;
/** 
 * @ClassName: Sinlgeton2
 * @Description: 懒汉式（同步方法能够直接解决线程问题，但性能最差）
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月5日 下午5:35:10
 */
public class Singleton2 {
	private static Singleton2 sinlgeton2;
	private Singleton2(){
	}
	
	public static synchronized Singleton2 getInstance(){
		//第一次调用的时候，实例化该对象
		if(sinlgeton2 == null){
			sinlgeton2 = new Singleton2();
		}
		return sinlgeton2;
	}
}
