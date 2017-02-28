/**
 * Project Name: questTestDemo
 * File Name: RunThread.java
 * Package Name: com.quest.thread
 * Date: 2017年2月22日上午10:50:38 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.thread;
/** 
 * @ClassName: RunThread
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月22日 上午10:50:38
 */
public class RunThread extends Thread {
	//volatile修饰变量，可以使得线程直接访问公共堆栈，而不会访问线程私有的工作内存，从而不会出现死循环的情况
	private volatile boolean isRunning = true;

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	@Override
	public void run() {
		System.out.println("进入run了");
		while( isRunning == true){
		}
		System.out.println("线程停止了");
	}
	
	
}
