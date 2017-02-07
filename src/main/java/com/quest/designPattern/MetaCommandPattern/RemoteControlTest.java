/**
 * Project Name: questTestDemo
 * File Name: RemoteControlTest.java
 * Package Name: com.quest.designPattern.OrderPattern
 * Date: 2017年2月6日下午2:11:38 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.MetaCommandPattern;

import com.quest.designPattern.MetaCommandPattern.commandPojo.Door;
import com.quest.designPattern.MetaCommandPattern.commandPojo.DoorOpenCommand;
import com.quest.designPattern.MetaCommandPattern.commandPojo.Light;
import com.quest.designPattern.MetaCommandPattern.commandPojo.LightOnCommand;

/** 
 * @ClassName: RemoteControlTest
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月6日 下午2:11:38
 */
public class RemoteControlTest {

	public static void main(String[] args) {
		//命令控制对象
		SimpleRemoteControl control = new SimpleRemoteControl();
		//创建命令对象并指定接收者（light）
		control.setCommand(new LightOnCommand(new Light()));
		control.buttonWasPressed();
		
		//创建命令对象并指定接收者（Door）
		control.setCommand(new DoorOpenCommand(new Door()));
		control.buttonWasPressed();
	}

}
