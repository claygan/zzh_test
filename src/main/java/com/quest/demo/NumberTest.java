/**
 * Project Name: questTestDemo
 * File Name: NumberTest.java
 * Package Name: com.quest.demo
 * Date: 2017年1月13日下午1:41:52 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;

import org.junit.Test;

import com.quest.utils.NumberConvertUtils;

/** 
 * @ClassName: NumberTest
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月13日 下午1:41:52
 */
public class NumberTest {
	/** 
	 * @Title: test
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @author ganshimin@zhongzhihui.com  
	 */  
	@Test
	public void test(){
//		//整形
//		int oNum = 1324356;
//		System.out.println("整型: "+NumberConvertUtils.toChineseNum(oNum));
//		//长整形
//		long longNum = 2342141252L;
//		System.out.println("长整型:"+NumberConvertUtils.toChineseNum(longNum));
//		//浮点型
//		double douNum = 121424.234;
		System.out.println(NumberConvertUtils.toChineseNum(100000));
		
	}
}
