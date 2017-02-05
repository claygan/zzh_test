/**
 * Project Name: questTestDemo
 * File Name: DateUtilsDemo.java
 * Package Name: com.quest.demo
 * Date: 2016年12月5日下午3:21:16 
 * Copyright (c) 2016, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;

import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

/** 
 * @ClassName: DateUtilsDemo
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2016年12月5日 下午3:21:16
 */
public class DateUtilsDemo {
	@Test
	public void test1(){
		Date date = new Date();
		System.out.println(DateUtils.RANGE_MONTH_MONDAY);
		System.out.println(DateUtils.RANGE_MONTH_SUNDAY);
		System.out.println(DateUtils.RANGE_WEEK_CENTER);
		System.out.println(DateUtils.RANGE_WEEK_MONDAY);
		System.out.println(DateUtils.RANGE_WEEK_RELATIVE);
		System.out.println(DateUtils.RANGE_WEEK_SUNDAY);
	}
}
