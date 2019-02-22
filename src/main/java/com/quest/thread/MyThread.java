/**
 * Project Name: questTestDemo
 * File Name: MyThread.java
 * Package Name: com.quest.thread
 * Date: 2017年2月23日下午2:55:32 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.thread;
/** 
 * @ClassName: MyThread
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月23日 下午2:55:32
 */
public class MyThread extends Thread {
	private volatile int count = 5;

	public MyThread(String name) {
		super(name);
	}

	@Override
	synchronized public void run() {
		super.run();
			count--;
			System.out.println("由 "+Thread.currentThread().getName()+"计算count= "+count);
	}
	
}
