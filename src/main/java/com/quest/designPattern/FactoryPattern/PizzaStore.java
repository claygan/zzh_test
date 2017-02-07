/**
 * Project Name: questTestDemo
 * File Name: PizzaStore.java
 * Package Name: com.quest.designPattern.FactoryPattern
 * Date: 2017年1月19日下午5:20:31 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.FactoryPattern;

import com.quest.designPattern.FactoryPattern.pizza.Pizza;

/** 
 * @ClassName: PizzaStore
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月19日 下午5:20:31
 */
public abstract class PizzaStore {
	//把创建pizza分类出来，并交给子类去管理(这就是一个工厂方法，实例化披萨的责任就被移到子类的方法中去执行)
	public abstract Pizza creatPizza(String type);
	
	//具体定制披萨步骤
	public Pizza orderPizza(String type){
		Pizza pizza;
		//只在抽象类中定义，这个方法不知道有什么具体类创建出来了，这个地方就体现了：解耦（decouple）
		pizza = creatPizza(type);
		if(pizza != null){
			System.out.println("================begin==================");
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
			System.out.println("================end==================");
		}else{
			System.out.println("has not this pizza");
		}
		
		return pizza;
	}
	
}
