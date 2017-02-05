/**
 * Project Name: questTestDemo
 * File Name: FlyRocketPowered.java
 * Package Name: com.quest.designModule.section01
 * Date: 2017年1月17日下午2:21:39 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.StrategyPattern;
/** 
 * @ClassName: FlyRocketPowered
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月17日 下午2:21:39
 */
public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket!");
	}

}
