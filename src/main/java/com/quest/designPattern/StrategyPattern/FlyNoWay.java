/**
 * Project Name: questTestDemo
 * File Name: FlyNoWay.java
 * Package Name: com.quest.designModule
 * Date: 2017年1月17日下午1:56:15 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.StrategyPattern;
/** 
 * @ClassName: FlyNoWay
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月17日 下午1:56:15
 */
public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}
