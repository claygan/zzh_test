/**
 * Project Name: questTestDemo
 * File Name: Consumer.java
 * Package Name: com.quest.thread
 * Date: 2017年2月24日下午5:07:53 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.thread;

import java.util.concurrent.locks.Lock;

/** 
 * @ClassName: Consumer
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月24日 下午5:07:53
 */
public class Consumer implements Runnable {
	private Lock lock;
	
	public Consumer(Lock lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		int count = 10;
		while(count > 0 ){
			try {
				lock.lock();
				count--;
				System.out.println("B");
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				lock.unlock();//主动释放锁
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		
		
	}

}
