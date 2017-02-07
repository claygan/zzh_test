/**
 * Project Name: questTestDemo
 * File Name: DoorOpenCommand.java
 * Package Name: com.quest.designPattern.OrderPattern.commandPojo
 * Date: 2017年2月6日下午2:21:46 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.MetaCommandPattern.commandPojo;

import com.quest.designPattern.MetaCommandPattern.Command;

/** 
 * @ClassName: DoorOpenCommand
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月6日 下午2:21:46
 */
public class DoorCloseCommand implements Command {
	Door door;
	
	public DoorCloseCommand(Door door) {
		this.door = door;
	}
	
	@Override
	public void execute() {		door.close();
	}

	@Override
	public void undo() {
		door.open();
	}

}
