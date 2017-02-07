/**
 * Project Name: questTestDemo
 * File Name: VolatileTest.java
 * Package Name: com.quest.demo
 * Date: 2017年2月6日上午10:07:13 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;

/**
 * @ClassName: VolatileTest
 * @Description: 对于值引用来说，多线程操作的是变量的副本，操作完后刷新到主存中。而对于地址引用
 * ，多线程是通过地址操作的是同一个变量。volatitle关键字告诉编译器，直接去通过地址操作变量，而不是变量的副本
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月6日 上午10:07:13
 */
public class VolatileTest {
	static class MyObject {
		static int mycount = 0;
	}

	public static void inc() {
		MyObject.mycount++;
	}

	public static void main(String[] args) {

		// 同时启动1000个线程，去进行i++计算，看看实际结果

		for (int i = 0; i < 10000; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					inc();
				}
			}).start();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;

		// 这里每次运行的值都有可能不同,可能为1000
		System.out.println("运行结果:Counter.count=" + MyObject.mycount);
	}
}
