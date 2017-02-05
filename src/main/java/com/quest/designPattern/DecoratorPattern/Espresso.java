/**
 * Project Name: questTestDemo
 * File Name: Espresso.java
 * Package Name: com.quest.designPattern.DecoratorPattern
 * Date: 2017年1月18日下午5:03:18 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.DecoratorPattern;
/** 
 * @ClassName: Espresso
 * @Description: 黑咖啡
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月18日 下午5:03:18
 */
public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;//黑咖啡价格
	}

}
