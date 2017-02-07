/**
 * Project Name: questTestDemo
 * File Name: SimpleRemoteControl.java
 * Package Name: com.quest.designPattern.OrderPattern
 * Date: 2017年2月6日下午1:52:29 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.MetaCommandPattern;
/** 
 * @ClassName: SimpleRemoteControl
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月6日 下午1:52:29
 */
public class SimpleRemoteControl {
	Command command;

	public SimpleRemoteControl() {}
	
	public void setCommand(Command command){
		this.command = command;
	}
	//当按下按钮，这个方法就会被调用，从而开始执行处理
	public void buttonWasPressed(){
		System.out.println("buttonWasPresseding......");
		command.execute();
	}
}
