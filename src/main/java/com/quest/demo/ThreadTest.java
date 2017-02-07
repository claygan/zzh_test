/**
 * Project Name: questTestDemo
 * File Name: ThreadTest.java
 * Package Name: com.quest.demo
 * Date: 2017年2月6日上午10:03:51 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;

/**
 * @ClassName: ThreadTest
 * @Description: 如果加了volatile JVM就会强制线程读\写操作直接跟主内存交互，禁用线程工作内存
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月6日 上午10:03:51
 */
public class ThreadTest {

	public volatile static int count = 0;

	public static void inc() {

		// 这里延迟1毫秒，使得结果明显
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
		}

		count++;
	}

	public static void main(String[] args) {

		// 同时启动1000个线程，去进行i++计算，看看实际结果

		for (int i = 0; i < 1000; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					ThreadTest.inc();
				}
			}).start();
		}

		// 这里每次运行的值都有可能不同,可能为1000
		System.out.println("运行结果:Counter.count=" + ThreadTest.count);
	}
}
