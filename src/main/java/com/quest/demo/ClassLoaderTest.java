/**
 * Project Name: questTestDemo
 * File Name: ClassLoaderTest.java
 * Package Name: com.quest.demo
 * Date: 2017年2月7日上午10:05:28 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;

import org.junit.Test;

/** 
 * @ClassName: ClassLoaderTest
 * @Description: 类加载相关问题测试
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月7日 上午10:05:28
 */
public class ClassLoaderTest {
	public static class  MyClass{
		private static MyClass myClass = new MyClass();//1.加载即实例化
		private static int num1;//3.实例化之后再加载成员变量
		private static int num2 = 0;//------------------>注意这个地方在单例模式下，不能够进行提前初始化
		private MyClass(){//2.实例化后，先执行构造方法内容
			num1++;
			num2++;
			System.out.println("num1_cache:"+num1);
			System.out.println("num2_cache:"+num2);
		}
		public static MyClass getInstance(){ 
			return myClass;
		}
	}
	/** 
	 * @Title: test
	 * @Description: 单例模式中一个关于类加载顺序的问题，可能会造成的bug，需要注意，不能在声明变量的时候一同初始化
	 * @author ganshimin@zhongzhihui.com  
	 */  
	@Test
	public void test(){
		MyClass myClass = MyClass.getInstance();
		System.out.println("num1: "+myClass.num1);
		System.out.println("num2: "+myClass.num2);
	}
}
