/**
 * Project Name: questTestDemo
 * File Name: Quack.java
 * Package Name: com.quest.designModule
 * Date: 2017年1月17日下午1:58:22 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.StrategyPattern;
/** 
 * @ClassName: Quack
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月17日 下午1:58:22
 */
public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack!!!");
	}

}
