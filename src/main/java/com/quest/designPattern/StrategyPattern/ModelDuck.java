/**
 * Project Name: questTestDemo
 * File Name: ModelDuck.java
 * Package Name: com.quest.designModule.section01
 * Date: 2017年1月17日下午2:22:59 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.StrategyPattern;
/** 
 * @ClassName: ModelDuck
 * @Description: 模型鸭，一开始不会飞
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月17日 下午2:22:59
 */
public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}
	
}
