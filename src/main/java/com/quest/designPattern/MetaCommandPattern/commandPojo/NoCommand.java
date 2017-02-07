/**
 * Project Name: questTestDemo
 * File Name: NoCommand.java
 * Package Name: com.quest.designPattern.MetaCommandPattern.commandPojo
 * Date: 2017年2月6日下午3:28:18 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.MetaCommandPattern.commandPojo;

import com.quest.designPattern.MetaCommandPattern.Command;

/** 
 * @ClassName: NoCommand
 * @Description: 为了避免，当没有控制目标的时候，需要一个个做判断，加一个空对象，可以使代码更加精简
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月6日 下午3:28:18
 */
public class NoCommand implements Command {

	@Override
	public void execute() {
		//什么都不做
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
