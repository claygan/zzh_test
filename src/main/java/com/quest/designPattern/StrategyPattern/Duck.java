/**
 * Project Name: questTestDemo
 * File Name: Duck.java
 * Package Name: com.quest.designModule
 * Date: 2017年1月17日下午12:00:11 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.StrategyPattern;
/** 
 * @ClassName: Duck
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月17日 下午12:00:11
 */
public abstract class Duck {
	//飞行接口
	FlyBehavior flyBehavior;
	//叫的接口
	QuackBehavior quackBehavior;
	public Duck() {
		
	}
	//鸭子必有的属性（鸭子的样子）
	public abstract void display();
	//鸭子会飞的行为
	public void performFly(){
		flyBehavior.fly();
	}
	//鸭子会叫的行为
	public void performQuack(){
		quackBehavior.quack();
	}
	//可以随时灵活更改鸭子的飞行行为
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	//可以随时更改鸭子的鸣叫行为
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
