/**
 * Project Name: questTestDemo
 * File Name: NYStyleCheesePizza.java
 * Package Name: com.quest.designPattern.FactoryPattern
 * Date: 2017年1月19日下午5:36:54 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.FactoryPattern;
/** 
 * @ClassName: NYStyleCheesePizza
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月19日 下午5:36:54
 */
public class NYStyleVeggiePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("add NewYork Style Veggie prepare");
	}
	
}
