/**
 * Project Name: questTestDemo
 * File Name: Test.java
 * Package Name: com.quest.thread
 * Date: 2017年2月24日下午5:24:32 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** 
 * @ClassName: Test
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月24日 下午5:24:32
 */
public class Test {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		Consumer consumer = new Consumer(lock);
		Producer producer = new Producer(lock);
		new Thread(consumer).start();
		new Thread(producer).start();
	}
}
