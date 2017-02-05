/**
 * Project Name: questTestDemo
 * File Name: WeatherData.java
 * Package Name: com.quest.designPattern.ObserverPattern
 * Date: 2017年1月17日下午4:46:12 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.ObserverPattern;

import java.util.ArrayList;

/** 
 * @ClassName: WeatherData
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月17日 下午4:46:12
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class WeatherData implements Subject {
	private ArrayList observers;
	//温度
	private float temperature;
	//湿度
	private float humidity;
	//压强
	private float pressure;

	
	public WeatherData(){
		observers = new ArrayList();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	/** 
	 * TODO 新注册观察者
	 * @see com.quest.designPattern.ObserverPattern.Subject#registerObserver(com.quest.designPattern.ObserverPattern.Observer) 
	 */
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	/** 
	 * TODO 移除观察者
	 * @see com.quest.designPattern.ObserverPattern.Subject#removeObserver(com.quest.designPattern.ObserverPattern.Observer) 
	 */
	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
		}
	}

	/** 
	 * TODO 通知所有观察者现在的改变
	 * @see com.quest.designPattern.ObserverPattern.Subject#notifyObservers() 
	 */
	@Override
	public void notifyObservers() {
		for(int i=0,len = observers.size();i<len;i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	/** 
	 * @Title: measurementChanged
	 * @Description: 检测改变
	 * @author ganshimin@zhongzhihui.com  
	 */  
	public void measurementChanged(){
		notifyObservers();
	}
	
	/** 
	 * @Title: setMeansurements
	 * @Description: 更新改变观测值
	 * @author ganshimin@zhongzhihui.com
	 * @param temperature
	 * @param humidity
	 * @param pressure  
	 */  
	public void setMeansurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}
}
