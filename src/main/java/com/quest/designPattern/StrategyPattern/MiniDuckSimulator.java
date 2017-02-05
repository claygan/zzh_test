/**
 * Project Name: questTestDemo
 * File Name: MiniDuckSimulator.java
 * Package Name: com.quest.designModule.section01
 * Date: 2017年1月17日下午2:15:30 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.StrategyPattern;
/** 
 * @ClassName: MiniDuckSimulator
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月17日 下午2:15:30
 */
public class MiniDuckSimulator {

	public static void main(String[] args) {
//		Duck duck = new MallarDuck();
//		duck.performFly();
//		duck.performQuack();
		
//		Duck duck = new ModelDuck();
//		duck.performFly();
//		//改变鸭子会飞的行为
//		duck.setFlyBehavior(new FlyRocketPowered());
//		duck.performFly();
		
		DuckCall duckcall = new DuckCall();
		duckcall.performQuack();
		
	}

}
