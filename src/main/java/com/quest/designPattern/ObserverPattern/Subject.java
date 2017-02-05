/**
 * Project Name: questTestDemo
 * File Name: WeatherData.java
 * Package Name: com.quest.designPattern.ObserverPattern
 * Date: 2017年1月17日下午4:41:45 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.ObserverPattern;
/** 
 * @ClassName: WeatherData
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月17日 下午4:41:45
 */
public interface Subject {
	//注册观察者
	void registerObserver(Observer o);
	//移除观察者
	void removeObserver(Observer o);
	//通知观察者们
	void notifyObservers();
}
