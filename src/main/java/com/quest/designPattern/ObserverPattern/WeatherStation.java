/**
 * Project Name: questTestDemo
 * File Name: WeatherStation.java
 * Package Name: com.quest.designPattern.ObserverPattern
 * Date: 2017年1月18日下午3:05:27 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.ObserverPattern;
/** 
 * @ClassName: WeatherStation
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月18日 下午3:05:27
 */
public class WeatherStation {

	public static void main(String[] args) {
		//实例化数据对象（主题）
		WeatherData weatherData = new WeatherData();
		//实例化一个布告板（观察者）
		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
		conditionsDisplay.display();
		weatherData.setMeansurements(12, 23, 100);
		weatherData.setMeansurements(24, 45, 100);
		weatherData.setMeansurements(26, 35, 100);
	}

}
