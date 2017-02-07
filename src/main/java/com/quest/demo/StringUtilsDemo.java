/**
 * Project Name: questTestDemo
 * File Name: StringUtilsDemo.java
 * Package Name: com.quest.demo
 * Date: 2016年12月5日下午3:11:35 
 * Copyright (c) 2016, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/** 
 * @ClassName: StringUtilsDemo
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2016年12月5日 下午3:11:35
 */
public class StringUtilsDemo {
	@Test
	public void test(){
		System.out.println(StringUtils.strip("aefabcdfea", "acef"));
	}
	@Test
	public void test1(){
		System.out.println(StringUtils.defaultIfEmpty("123", "0"));
		System.out.println(StringUtils.defaultIfEmpty("", "0"));
		System.out.println(StringUtils.defaultIfEmpty(null, "0"));
		System.out.println("empty:"+StringUtils.defaultIfEmpty(" ", "0"));
		System.out.println("blank:"+StringUtils.defaultIfBlank(" ", "0"));
	}
	
	@Test
	public void test2(){
		String nickName = "一朵梨花压海棠";
		System.out.println(convertStarString(nickName, 2, 2));
	}
	
	
	public static String convertStarString(String content,int begin,int end){
		content = content.substring(0,begin)+"***"+content.substring(content.length()-end, content.length());
		return content;
	}
	@Test
	public void test3(){
		String num = "as.asd";
		System.out.println(num.split("\\.").length);
		System.out.println(num.split("\\.")[0]);
		System.out.println(num.split("\\.")[1]);
	}
}
