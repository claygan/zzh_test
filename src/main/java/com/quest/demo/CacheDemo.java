/**
 * Project Name: questTestDemo
 * File Name: CacheDemo.java
 * Package Name: com.quest.demo
 * Date: 2016年12月5日下午3:43:12 
 * Copyright (c) 2016, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

import org.junit.Test;

import com.quest.entity.Cache;

/** 
 * @ClassName: CacheDemo
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2016年12月5日 下午3:43:12
 */
public class CacheDemo {
	@Test
	public void test1(){
		SoftReference<Cache> soft = new SoftReference<Cache>(new Cache(1));
		WeakReference<Cache> weak = new WeakReference<Cache>(new Cache(3));
//		PhantomReference<Cache> phantom = new PhantomReference<Cache>(new Cache(4), queue);
		System.out.println("soft --> " + soft.get());//soft --> 1
		System.out.println("weak --> " + weak.get());//weak --> 3
//		System.out.println("phantom --> " + phantom.get());//phantom --> null

		System.gc();
		try {
			Thread.sleep(30 * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("===after gc==");//===after gc==
		System.out.println("soft --> " + soft.get());//soft --> 1
		System.out.println("weak --> " + weak.get());//weak --> null
//		System.out.println("phantom --> " + phantom.get());//phantom --> null
	}
}
