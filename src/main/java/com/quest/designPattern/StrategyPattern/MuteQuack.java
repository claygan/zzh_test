/**
 * Project Name: questTestDemo
 * File Name: MuteQuack.java
 * Package Name: com.quest.designModule
 * Date: 2017年1月17日下午2:04:14 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.StrategyPattern;
/** 
 * @ClassName: MuteQuack
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月17日 下午2:04:14
 */
public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("slience……");
	}

}
