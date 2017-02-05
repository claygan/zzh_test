/**
 * Project Name: questTestDemo
 * File Name: DuckCall.java
 * Package Name: com.quest.designModule.section01
 * Date: 2017年1月17日下午2:37:55 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.StrategyPattern;
/** 
 * @ClassName: DuckCall
 * @Description: 鸭鸣器
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月17日 下午2:37:55
 */
public class DuckCall {
	QuackBehavior quackBehavior;

	public DuckCall() {
		//默认模仿鸭子吱吱叫，引诱鸭子
		quackBehavior = new Squeak();
	}

	//当然也可以改变模拟鸭子的叫声
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	public void performQuack(){
		quackBehavior.quack();
	}
	
}
