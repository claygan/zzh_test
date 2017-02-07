/**
 * Project Name: questTestDemo
 * File Name: VolatileTest.java
 * Package Name: com.quest.demo
 * Date: 2017年2月6日上午10:07:13 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;

import org.junit.Test;

/**
 * @ClassName: VolatileTest
 * @Description: 对volatile声明的变量单个调用时保持原子性，复合调用时代码不具备原子性
 *  
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月6日 上午10:07:13
 */
public class VolatileTest2 {
	@Test
	public void test(){
		class VolatileFeaturesExample {
		    volatile long vl = 0L;  //使用volatile声明64位的long型变量
		 
		    public void set(long l) {
		        vl = l;   //单个volatile变量的写
		    }
		 
		    public void getAndIncrement () {
		        vl++;    //复合（多个）volatile变量的读/写
		    }
		 
		 
		    public long get() {
		        return vl;   //单个volatile变量的读
		    }
		}
	}
	/** 
	 * @Title: test2
	 * @Description: 上述代码在多线程调用时类似下面：
	 * @author ganshimin@zhongzhihui.com  
	 */  
	@Test
	public void test2(){
		class VolatileFeaturesExample {
		    long vl = 0L;               // 64位的long型普通变量
		 
		    public synchronized void set(long l) {     //对单个的普通 变量的写用同一个监视器同步
		        vl = l;
		    }
		 
		    public void getAndIncrement () { //普通方法调用
		        long temp = get();           //调用已同步的读方法
		        temp += 1L;                  //普通写操作， <b>这里不具备原子性</b>       
		        set(temp);                   //调用已同步的写方法
		    }
		    public synchronized long get() {
		    //对单个的普通变量的读用同一个监视器同步
		        return vl;
		    }
		}
	}
}
