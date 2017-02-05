/**
 * Project Name: questTestDemo
 * File Name: MallarDuck.java
 * Package Name: com.quest.designModule
 * Date: 2017年1月17日下午2:08:04 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.StrategyPattern;
/** 
 * @ClassName: MallarDuck
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月17日 下午2:08:04
 */
public class MallarDuck extends Duck {

	public MallarDuck(){
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck!");
	}

}
