/**
 * Project Name: questTestDemo
 * File Name: CallByTest.java
 * Package Name: com.quest.demo
 * Date: 2017年2月8日下午4:10:36 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;

import org.junit.Test;

/** 
 * @ClassName: CallByTest
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月8日 下午4:10:36
 */
public class CallBy {
	int value;
	public CallBy swap1(CallBy a,CallBy b) {
	    CallBy t = a;
	    a = b;
	    b = t;
	    return b;
	}
	public int swap2(CallBy a,CallBy b) {
	    int t = a.value;
	    a.value = b.value;
	    b.value  = t;
	    return t;
	}
	@Test
	public void test(){
		
	}
}
