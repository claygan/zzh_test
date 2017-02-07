/**
 * Project Name: questTestDemo
 * File Name: LightOnCommand.java
 * Package Name: com.quest.designPattern.OrderPattern
 * Date: 2017年2月6日下午12:00:48 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.MetaCommandPattern.commandPojo;

import com.quest.designPattern.MetaCommandPattern.Command;

/** 
 * @ClassName: LightOffCommand
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.comk
 * @date: 2017年2月6日 下午12:00:48
 */
public class LightOffCommand implements Command {
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
