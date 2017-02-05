/**
 * Project Name: questTestDemo
 * File Name: StringEscapeUtilsDemo.java
 * Package Name: StringEscapeUtils
 * Date: 2016年12月5日下午4:54:29 
 * Copyright (c) 2016, www.zhongzhihui.com All Rights Reserved. 
 */

package StringEscapeUtils;

import org.apache.commons.lang3.StringEscapeUtils;
import org.junit.Test;

/** 
 * @ClassName: StringEscapeUtilsDemo
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2016年12月5日 下午4:54:29
 */
public class StringEscapeUtilsDemo {
	@Test
	public void test1(){
		System.out.println(StringEscapeUtils.escapeHtml4("^&!%#&!"));
	}
}
