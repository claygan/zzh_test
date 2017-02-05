/**
 * Project Name: questTestDemo
 * File Name: Beverage.java
 * Package Name: com.quest.designPattern.DecoratorPattern
 * Date: 2017年1月18日下午3:51:16 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.DecoratorPattern;
/** 
 * @ClassName: Beverage
 * @Description: 饮料超类
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月18日 下午3:51:16
 */
public abstract class Beverage {
	public String description = "Unknow Beverage";

	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
