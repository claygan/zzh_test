/**
 * Project Name: questTestDemo
 * File Name: Milk.java
 * Package Name: com.quest.designPattern.DecoratorPattern
 * Date: 2017年1月18日下午5:01:03 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.DecoratorPattern;
/** 
 * @ClassName: Milk
 * @Description: 牛奶（装饰者）
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月18日 下午5:01:03
 */
public class Milk extends CondimentDecorator {
	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public double cost() {
		return .10 + beverage.cost();
	}
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}
	
}
