/**
 * Project Name: questTestDemo
 * File Name: NoVisibility.java
 * Package Name: com.quest.demo
 * Date: 2017年2月15日下午2:31:19 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;
/** 
 * @ClassName: NoVisibility
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月15日 下午2:31:19
 */
public class NoVisibility {
	private static boolean ready;
    private static int number;
    private static class ReaderThread extends Thread {
        @Override
        public void run() {
            while(!ready) {
                Thread.yield();
            }
            System.out.println(number);
        }
    }
    public static void main(String[] args) {
        new ReaderThread().start();
        number = 42;
        ready = true;
    }
}
