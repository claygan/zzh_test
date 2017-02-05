/**
 * Project Name: questTestDemo
 * File Name: Observer.java
 * Package Name: com.quest.designPattern.ObserverPattern
 * Date: 2017年1月17日下午4:43:42 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.ObserverPattern;
/** 
 * @ClassName: Observer
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月17日 下午4:43:42
 */
public interface Observer {
	void update(float temp, float humidity, float pressure);
}
