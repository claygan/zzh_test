/**
 * Project Name: questTestDemo
 * File Name: DarkRoast.java
 * Package Name: com.quest.designPattern.DecoratorPattern
 * Date: 2017年1月18日下午3:56:35 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.DecoratorPattern;

/** 
 * @ClassName: DarkRoast
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月18日 下午3:56:35
 */
public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		description = "DarkRoast";
	}
	
	@Override
	public double cost() {
		return 1.23;
	}
	
}
