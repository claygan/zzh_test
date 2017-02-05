/**
 * Project Name: questTestDemo
 * File Name: Customer.java
 * Package Name: com.quest.designPattern.DecoratorPattern
 * Date: 2017年1月18日下午4:02:06 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.DecoratorPattern;
/** 
 * @ClassName: Customer
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月18日 下午4:02:06
 */
public class Customer {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()+" $"+beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
		//关键部分，在运行时可以再次改变该对象的行为
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription()+" $"+beverage3.cost());
	}

}
