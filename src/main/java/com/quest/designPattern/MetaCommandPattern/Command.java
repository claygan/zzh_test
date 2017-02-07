/**
 * Project Name: questTestDemo
 * File Name: Command.java
 * Package Name: com.quest.designPattern.OrderPattern
 * Date: 2017年2月6日上午11:57:08 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.MetaCommandPattern;
/** 
 * @ClassName: Command
 * @Description: 命令接口
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月6日 上午11:57:08
 */
public interface Command {
	void execute();
	void undo();
}
