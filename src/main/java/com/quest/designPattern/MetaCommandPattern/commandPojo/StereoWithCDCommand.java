/**
 * Project Name: questTestDemo
 * File Name: StereoWithCDCommand.java
 * Package Name: com.quest.designPattern.MetaCommandPattern.commandPojo
 * Date: 2017年2月6日下午3:19:59 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.MetaCommandPattern.commandPojo;

import com.quest.designPattern.MetaCommandPattern.Command;

/** 
 * @ClassName: StereoWithCDCommand
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月6日 下午3:19:59
 */
public class StereoWithCDCommand implements Command {
	Stereo stereo; 
	
	public StereoWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.setCD();
		stereo.setVolume(10);
		stereo.on();

	}

	@Override
	public void undo() {
		stereo.off();
	}

}
