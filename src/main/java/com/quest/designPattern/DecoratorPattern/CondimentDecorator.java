/**
 * Project Name: questTestDemo
 * File Name: Condiment.java
 * Package Name: com.quest.designPattern.DecoratorPattern
 * Date: 2017年1月18日下午4:50:57 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.DecoratorPattern;
/** 
 * @ClassName: Condiment
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月18日 下午4:50:57
 */
public abstract class CondimentDecorator extends Beverage {

	@Override
	public double cost() {
		return 0;
	}

	/** 
	 * TODO 这是比较关键的地方（在重写了被装饰者的方法后，修改为抽象方法，子类必须重写）
	 * @see com.quest.designPattern.DecoratorPattern.Beverage#getDescription() 
	 */
	@Override
	public abstract String getDescription();
	
}
