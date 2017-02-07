/**
 * Project Name: questTestDemo
 * File Name: NYStylePizzaStore.java
 * Package Name: com.quest.designPattern.FactoryPattern
 * Date: 2017年1月19日下午5:29:15 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.FactoryPattern;

import com.quest.designPattern.FactoryPattern.ingredient.NyPizzaIngredientFactory;
import com.quest.designPattern.FactoryPattern.ingredient.PizzaIngredientFactory;
import com.quest.designPattern.FactoryPattern.pizza.CheesePizza;
import com.quest.designPattern.FactoryPattern.pizza.ClamsPizza;
import com.quest.designPattern.FactoryPattern.pizza.Pizza;

/** 
 * @ClassName: NYStylePizzaStore
 * @Description: 纽约风格的披萨加盟店
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月19日 下午5:29:15
 */
public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza creatPizza(String type) {
		
//		//可以按照自己当地的风格定制化自己的口味（自定义创建不同的对象）
//		if("cheese".equals(type)){
//			return new NYStyleCheesePizza();
//		}else if("veggie".equals(type)){
//			return new NYStyleVeggiePizza();
//		}
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();
		if("cheese".equals(type)){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}else if("clams".equals(type)){
			pizza = new ClamsPizza(ingredientFactory);
			pizza.setName("New York Style Clams Pizza");
		}
		
		return pizza;
	}

}
