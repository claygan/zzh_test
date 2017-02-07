/**
 * Project Name: questTestDemo
 * File Name: Light.java
 * Package Name: com.quest.designPattern.OrderPattern
 * Date: 2017年2月6日上午11:57:59 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.MetaCommandPattern.commandPojo;
/** 
 * @ClassName: Light
 * @Description: 灯
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月6日 上午11:57:59
 */
public class Light {
	boolean status = false;
	
	public void on(){
		status = true;
		System.out.println("light turn on，status: "+ status);
	}
	
	public void off(){
		status = false;
		System.out.println("light turn off，status: "+ status);
	}
}
