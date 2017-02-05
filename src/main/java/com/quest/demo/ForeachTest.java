/**
 * Project Name: questTestDemo
 * File Name: ForeachTest.java
 * Package Name: com.quest.demo
 * Date: 2017年1月18日下午2:27:54 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;
import org.junit.Test;
/** 
 * @ClassName: ForeachTest
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月18日 下午2:27:54
 */
public class ForeachTest {
	@Test
	public void test(){
		char[] charArray = "abcdefghijksdgsafsgasdgasgasdfsafwefgawgwgW".toCharArray();
		long start = System.currentTimeMillis();
		System.out.println(start);
		
		for(int i=0;i<charArray.length;i++){
			System.out.print(charArray[i]);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n"+(System.currentTimeMillis()-start));
	}
	@Test
	public void test1(){
		char[] charArray = "abcdefghijksdgsafsgasdgasgasdfsafwefgawgwgW".toCharArray();
		long start = System.currentTimeMillis();
		System.out.println(start);
		
		for(int i=0,len = charArray.length;i<len;i++){
			System.out.print(charArray[i]);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n"+(System.currentTimeMillis()-start));
	}
}
