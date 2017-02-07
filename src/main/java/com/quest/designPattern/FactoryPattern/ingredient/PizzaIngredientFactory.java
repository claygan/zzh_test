/**
 * Project Name: questTestDemo
 * File Name: PizzaIngredientFactory.java
 * Package Name: com.quest.designPattern.FactoryPattern
 * Date: 2017年2月5日下午4:04:59 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.FactoryPattern.ingredient;
/** 
 * @ClassName: PizzaIngredientFactory
 * @Description: 原料工厂接口
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月5日 下午4:04:59
 */
public interface PizzaIngredientFactory {
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Clams createClams();
}
