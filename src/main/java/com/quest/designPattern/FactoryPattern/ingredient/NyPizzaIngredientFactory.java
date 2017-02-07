/**
 * Project Name: questTestDemo
 * File Name: NyPizzaIngredientFactory.java
 * Package Name: com.quest.designPattern.FactoryPattern.ingredient
 * Date: 2017年2月5日下午4:48:47 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.FactoryPattern.ingredient;
/** 
 * @ClassName: NyPizzaIngredientFactory
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月5日 下午4:48:47
 */
public class NyPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		System.out.println("produce:ThickCrustDough");
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		System.out.println("produce:MarimaraSauce");
		return new MarimaraSauce();
	}

	@Override
	public Cheese createCheese() {
		System.out.println("produce:ReggianoCheese");
		return new ReggianoCheese();
	}

	@Override
	public Clams createClams() {
		System.out.println("produce:FreshClams");
		return new FreshClams();
	}

}
