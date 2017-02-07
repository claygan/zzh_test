/**
 * Project Name: questTestDemo
 * File Name: Singleton3.java
 * Package Name: com.quest.designPattern.SingletonPattern
 * Date: 2017年2月6日上午9:51:12 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.SingletonPattern;
/** 
 * @ClassName: Singleton3
 * @Description: 双重检查加锁(性能优化很多，由于volatile关键字，所以只适用于java5以上版本)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月6日 上午9:51:12
 */
public class Singleton3 {
	//volatile关键字可以使该变量在多线程环境下，直接通过地址访问主内存，从而保证多线性能够正确处理变量
	private volatile static Singleton3 singleton3;
	
	private Singleton3(){}
	
	public static Singleton3 getInstance(){
		if(singleton3 == null){
			//同步块操作可以保证只有第一次才会执行同步块中的代码，从而大大优化了同步带来的性能问题
			synchronized (Singleton3.class) {
				if(singleton3 == null){
					singleton3 = new Singleton3();
				}
			}
		}
		return singleton3;
	}
}
