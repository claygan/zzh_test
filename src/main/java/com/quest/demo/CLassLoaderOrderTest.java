/**
 * Project Name: questTestDemo
 * File Name: CLassLoaderOrderTest.java
 * Package Name: com.quest.demo
 * Date: 2017年2月7日上午10:40:25 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;

import org.junit.Test;

/** 
 * @ClassName: CLassLoaderOrderTest
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月7日 上午10:40:25
 */
public class CLassLoaderOrderTest {
	/** 
	 * @ClassName: Parent
	 * @Description: 父类
	 * 
	 * @author ganshimin@zhongzhihui.com
	 * @date: 2017年2月7日 上午10:41:10
	 */  
	public static class Parent
	{
	    public static int t = parentStaticMethod2();
	    {
	        System.out.println("父类非静态初始化块");//
	    }
	    static
	    {
	        System.out.println("父类静态初始化块");
	    }
	    public Parent()
	    {
	        System.out.println("父类的构造方法");
	    }
	    public static int parentStaticMethod()
	    {
	        System.out.println("父类类的静态方法");
	        return 10;
	    }
	    public static int parentStaticMethod2()
	    {
	        System.out.println("父类的静态方法2");
	        return 9;
	    }
	  
	    @Override
	    protected void finalize() throws Throwable
	    {
	        // TODO Auto-generated method stub
	        super.finalize();
	        System.out.println("销毁父类");
	    }
	    
	}
	/** 
	 * @ClassName: Child
	 * @Description: 子类
	 * 
	 * @author ganshimin@zhongzhihui.com
	 * @date: 2017年2月7日 上午10:41:22
	 */  
	public static class Child extends Parent
	{
	    {
	        System.out.println("子类非静态初始化块");
	    }
	    static
	    {
	        System.out.println("子类静态初始化块");
	    }
	    public Child()
	    {
	        System.out.println("子类的构造方法");
	    }
	    public static int childStaticMethod()
	    {
	        System.out.println("子类的静态方法");
	        return 1000;
	    }
	    @Override
	    protected void finalize() throws Throwable
	    {
	        // TODO Auto-generated method stub
	        super.finalize();
	        System.out.println("销毁子类");
	    }
	}
	@Test
	public void test(){
//		Parent.parentStaticMethod();
		Child child = new Child();
	}
}
