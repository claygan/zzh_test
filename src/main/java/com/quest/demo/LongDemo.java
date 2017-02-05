/**
 * Project Name: questTestDemo
 * File Name: LongDemo.java
 * Package Name: com.quest.demo
 * Date: 2016年12月13日下午3:49:06 
 * Copyright (c) 2016, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;

import org.junit.Test;

/** 
 * @ClassName: LongDemo
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2016年12月13日 下午3:49:06
 */
public class LongDemo {
	@Test
	public void test(){
		Long o1 = Long.valueOf(123);
		Long o2 = Long.valueOf(123);
		A a = new A("123");
		System.out.println(o1.equals(o2));
		System.out.println(o1==a.getO3());
		System.out.println("====================");
	}
	
	private class A{
		private Long o3;
		public A(String o3){
			this.o3 = Long.valueOf(o3);
		}
		public Long getO3() {
			return o3;
		}
		public void setO3(Long o3) {
			this.o3 = o3;
		}
		
	}
	@Test
	public void test1(){
		Long companyId = null;
		int result = (companyId != null? Integer.parseInt(companyId.toString()):0);
		System.out.println(result);
	}
	
	@Test
	public void test2(){
		int result = Integer.parseInt(null);
		System.out.println(result);
	}
}
