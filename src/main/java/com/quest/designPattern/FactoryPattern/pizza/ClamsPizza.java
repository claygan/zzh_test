/**
 * Project Name: questTestDemo
 * File Name: CheesePizza.java
 * Package Name: com.quest.designPattern.FactoryPattern.pizza
 * Date: 2017年2月5日下午4:37:10 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.FactoryPattern.pizza;

import com.quest.designPattern.FactoryPattern.ingredient.PizzaIngredientFactory;

/** 
 * @ClassName: CheesePizza
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月5日 下午4:37:10
 */
public class ClamsPizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;
	
	public ClamsPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing" + name);
		//制作披萨的原料全部都从原料工厂中获取，这是抽象工厂模式的核心之处，实现披萨与原料之间的解耦，具体类由子类来决定
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
		clams = pizzaIngredientFactory.createClams();
	}

}
