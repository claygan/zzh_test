/**
 * Project Name: questTestDemo
 * File Name: TestMemory.java
 * Package Name: com.quest.demo
 * Date: 2016年11月23日下午3:24:59 
 * Copyright (c) 2016, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;
/** 
 * @ClassName: TestMemory
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2016年11月23日 下午3:24:59
 */
public class TestMemory {

	 

    /**

      * @param args

      */

    public static void main(String[] args) {

       System. out .println( " 内存信息 :" + toMemoryInfo());

    }

 

    /**

      * 获取当前 jvm 的内存信息

      *

      * @return

      */

    public static String toMemoryInfo() {

 

       Runtime currRuntime = Runtime.getRuntime ();

       int nFreeMemory = ( int ) (currRuntime.freeMemory() / 1024 / 1024);

       int nTotalMemory = ( int ) (currRuntime.totalMemory() / 1024 / 1024);

       return nFreeMemory + "M/" + nTotalMemory +"M(free/total)" ;

    }

}
