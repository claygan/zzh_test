/**
 * Project Name: questTestDemo
 * File Name: BeanTest.java
 * Package Name: com.quest.demo
 * Date: 2016年12月8日下午10:46:09 
 * Copyright (c) 2016, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

/**
 * @ClassName: BeanTest
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2016年12月8日 下午10:46:09
 */
public class BeanTest {

	public  static class A {

		String s;

		int i;

		public String getS() {
			return s;
		}

		public void setS(String s) {
			this.s = s;
		}

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}

	}
	
	
	public static class B{
		String s;
		
		Integer i;

		public String getS() {
			return s;
		}

		public void setS(String s) {
			this.s = s;
		}

		public Integer getI() {
			return i;
		}

		public void setI(Integer i) {
			this.i = i;
		}
		
		
	}
	
	

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		A a = new A();
		B b = new B();
		a.setI(1);
		a.setS("a");
		Class<B> c =B.class;
		
		
		BeanUtils.copyProperties(b, a);
		System.out.println(b);
	}
}
