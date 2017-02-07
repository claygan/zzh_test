/**
 * Project Name: questTestDemo
 * File Name: EnumerationIterator.java
 * Package Name: com.quest.designPattern.AdapterPattern
 * Date: 2017年2月7日上午11:20:50 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.designPattern.AdapterPattern;

import java.util.Enumeration;
import java.util.Iterator;

/** 
 * @ClassName: EnumerationIterator
 * @Description: 将旧版的Enumeration适配成新版的Iterator
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月7日 上午11:20:50
 */
public class EnumerationIterator implements Iterator {

	Enumeration enumration;
	
	public EnumerationIterator(Enumeration enumration) {
		this.enumration = enumration;
	}

	@Override
	public boolean hasNext() {
		return enumration.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumration.nextElement();
	}

	@Override
	public void remove() {
		//由于旧版的Enumeration并没有提供删除方法，所以这里只能放弃适配，并抛出异常
		throw new UnsupportedOperationException();
		
	}

}
