/**
 * Project Name: questTestDemo
 * File Name: Stereo.java
 * Package Name: com.quest.designPattern.MetaCommandPattern.commandPojo
 * Date: 2017年2月6日下午3:07:21 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.MetaCommandPattern.commandPojo;
/** 
 * @ClassName: Stereo
 * @Description: 音响
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月6日 下午3:07:21
 */
public class Stereo {
	private boolean status = false;
	private boolean cd = false;
	private int volume = 0;
	public void on(){
		if(cd){
			status = true;
			System.out.println("the Stereo will play, status:"+ status);
		}else{
			System.out.println("the Stereo has not CD !");
		}
	}
	public void off(){
		status = false;
		System.out.println("the Stereo is off, status:"+ status);
	}
	public void setCD(){
		cd = true;
		System.out.println("cd is in stereo");
	}
	public void setVolume(int volume){
		this.volume = volume;
		System.out.println("now the volume is : "+ volume);
	}
}
