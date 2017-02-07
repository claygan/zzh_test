/**
 * Project Name: questTestDemo
 * File Name: OrderPizza.java
 * Package Name: com.quest.designPattern.FactoryPattern
 * Date: 2017年1月19日下午5:45:35 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.FactoryPattern;
/** 
 * @ClassName: OrderPizza
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月19日 下午5:45:35
 */
public class OrderPizza {

	public static void main(String[] args) {
//		PizzaStore store = new NYPizzaStore();
//		//
//		store.orderPizza("viggie");
//		//
//		store.orderPizza("cheese");
		
		//抽象方法工厂测试
		PizzaStore nyPizzaStore = new NYPizzaStore();
		nyPizzaStore.orderPizza("clams");
		
	}

}
