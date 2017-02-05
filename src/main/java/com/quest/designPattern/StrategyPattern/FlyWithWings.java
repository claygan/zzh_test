/**
 * Project Name: questTestDemo
 * File Name: FlyWithWings.java
 * Package Name: com.quest.designModule
 * Date: 2017年1月17日下午1:55:22 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.StrategyPattern;
/** 
 * @ClassName: FlyWithWings
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月17日 下午1:55:22
 */
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with my wings");
	}

}
