/**
 * Project Name: questTestDemo
 * File Name: CurrentTheadTest.java
 * Package Name: com.quest.thread
 * Date: 2017年2月23日上午10:37:29 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.thread;

import org.junit.Test;

/** 
 * @ClassName: CurrentTheadTest
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月23日 上午10:37:29
 */
public class CurrentTheadTest {
	@Test
	public void test(){
		System.out.println(Thread.currentThread().getName());
	}
	@Test
	public void test2(){
		//非共享数据关系
		Thread myThread1 = new MyThread("A");
		Thread myThread2 = new MyThread("B");
		Thread myThread3 = new MyThread("C");
		Thread myThread4 = new MyThread("D");
		Thread myThread5 = new MyThread("E");
		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
		myThread5.start();
		
		//MyThread myThread = new MyThread();
		//
		//Thread thread1 = new Thread(myThread,"A");
		//Thread thread2 = new Thread(myThread,"B");
		//Thread thread3 = new Thread(myThread,"C");
		//Thread thread4 = new Thread(myThread,"D");
		//Thread thread5 = new Thread(myThread,"E");
		//
		//thread1.start();
		//thread2.start();
		//thread3.start();
		//thread4.start();
		//thread5.start();
		
	}
}
