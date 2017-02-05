/**
 * Project Name: questTestDemo
 * File Name: CurrentConditionsDisplay.java
 * Package Name: com.quest.designPattern.ObserverPattern
 * Date: 2017年1月17日下午4:52:01 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.ObserverPattern;
/** 
 * @ClassName: CurrentConditionsDisplay
 * @Description: 显示当前观测值
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月17日 下午4:52:01
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	//温度
	private float temperature;
	//湿度
	private float humidity;
	
	@SuppressWarnings("unused")
	private Subject weatherData;
	
	
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		//通过构造器注册自己
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("CurrentConditionsDisplay [temperature=" + temperature + ", humidity=" + humidity + "]");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
