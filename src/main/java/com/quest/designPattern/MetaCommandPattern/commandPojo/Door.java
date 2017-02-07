/**
 * Project Name: questTestDemo
 * File Name: Door.java
 * Package Name: com.quest.designPattern.OrderPattern.commandPojo
 * Date: 2017年2月6日下午2:18:34 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.MetaCommandPattern.commandPojo;
/** 
 * @ClassName: Door
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月6日 下午2:18:34
 */
public class Door {
	private String stutas = "close";
	
	public void open(){
		stutas = "open";
		System.out.println("open the door, stutas: "+ stutas);
	}
	
	public void close(){
		stutas = "close";
		System.out.println("close the door, stutas: "+ stutas);
	}
}
