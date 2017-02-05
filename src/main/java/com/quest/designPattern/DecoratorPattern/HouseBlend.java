/**
 * Project Name: questTestDemo
 * File Name: HouseBlend.java
 * Package Name: com.quest.designPattern.DecoratorPattern
 * Date: 2017年1月18日下午5:06:01 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.DecoratorPattern;
/** 
 * @ClassName: HouseBlend
 * @Description: 混合咖啡(同黑咖啡，只是名称不同)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月18日 下午5:06:01
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "HouseBlend Coffee";
	}

	@Override
	public double cost() {
		return .89;
	}

}
