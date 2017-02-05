/**
 * Project Name: questTestDemo
 * File Name: Pizza.java
 * Package Name: com.quest.designPattern.FactoryPattern
 * Date: 2017年1月19日下午5:21:07 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.FactoryPattern;
/** 
 * @ClassName: Pizza
 * @Description: 披萨
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月19日 下午5:21:07
 */
public class Pizza {
	public void prepare(){
		//准备食材
		System.out.println("Original Prepare");
	}
	public void bake(){
		//烘焙
		System.out.println("Original bake");
	}
	public void cut(){
		//切块
		System.out.println("Original cut");
	}
	public void box(){
		//打包
		System.out.println("Original box");
	}
}
