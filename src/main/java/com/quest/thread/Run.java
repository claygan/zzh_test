/**
 * Project Name: questTestDemo
 * File Name: Run.java
 * Package Name: com.quest.thread
 * Date: 2017年2月22日上午10:37:05 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.thread;
/** 
 * @ClassName: Run
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月22日 上午10:37:05
 */
public class Run {
	public static void main(String[] args) {
//		PrintString printString = new PrintString();
////		printString.printStringMethod();
//		new Thread(printString).start();
//		System.out.println("我要停止它！ stopThread="+Thread.currentThread().getName());
//		printString.setContinuePrint(false);
		
		try {
			RunThread runThread = new RunThread();
			runThread.start();
			Thread.sleep(1000);
			runThread.setRunning(false);
			System.out.println("已经赋值为false了");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
