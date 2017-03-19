/**
 * Project Name: questTestDemo
 * File Name: PrintString.java
 * Package Name: com.quest.thread
 * Date: 2017年2月22日上午10:26:51 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.thread;
/** 
 * @ClassName: PrintString
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月22日 上午10:26:51
 */
public class PrintString implements Runnable{
	private boolean isContinuePrint = true;

	public boolean isContinuePrint() {
		return isContinuePrint;
	}

	public void setContinuePrint(boolean isContinuePrint) {
		this.isContinuePrint = isContinuePrint;
	}
	
	public void printStringMethod(){
		try {
			while(isContinuePrint == true){
				System.out.println("run printStringMethod threadName="+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		printStringMethod();
	}
	
	
	
}
