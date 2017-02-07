/**
 * Project Name: questTestDemo
 * File Name: Pizza.java
 * Package Name: com.quest.designPattern.FactoryPattern
 * Date: 2017年1月19日下午5:21:07 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.FactoryPattern.pizza;

import com.quest.designPattern.FactoryPattern.ingredient.Cheese;
import com.quest.designPattern.FactoryPattern.ingredient.Clams;
import com.quest.designPattern.FactoryPattern.ingredient.Dough;
import com.quest.designPattern.FactoryPattern.ingredient.Sauce;

/** 
 * @ClassName: Pizza
 * @Description: 披萨
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月19日 下午5:21:07
 */
public abstract class Pizza {
	public String name;
	public Dough dough;
	public Sauce sauce;
	public Cheese cheese;
	public Clams clams;
	
	public abstract void prepare();
	
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", cheese=" + cheese + ", clams=" + clams + "]";
	}
	
}
