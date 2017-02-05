/**
 * Project Name: questTestDemo
 * File Name: FileUtilsDemo.java
 * Package Name: com.quest.demo
 * Date: 2016年12月5日下午3:26:03 
 * Copyright (c) 2016, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

/** 
 * @ClassName: FileUtilsDemo
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2016年12月5日 下午3:26:03
 */
public class FileUtilsDemo {
	@Test
	public void test1() throws IOException{
		File file = new File("D:/Documents/Desktop/pom_plugins.txt");
		String content = FileUtils.readFileToString(file, Charset.forName("UTF-8"));
		System.out.println(content);
	}
}
