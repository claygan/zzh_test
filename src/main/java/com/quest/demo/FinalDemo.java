/**
 * Project Name: questTestDemo
 * File Name: FinalDemo.java
 * Package Name: com.quest.demo
 * Date: 2016年12月5日下午3:56:42 
 * Copyright (c) 2016, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;

import org.junit.Test;

import com.quest.entity.ApiResult;

/** 
 * @ClassName: FinalDemo
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2016年12月5日 下午3:56:42
 */
public class FinalDemo {
	@Test
	public void test1(){
		ApiResult apiResult = new ApiResult("1.0.0", 142857L);
		System.out.println(apiResult);
	}
}
