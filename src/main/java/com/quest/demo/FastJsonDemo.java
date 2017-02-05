/**
 * Project Name: questTestDemo
 * File Name: FastJsonDemo.java
 * Package Name: com.quest.demo
 * Date: 2016年12月25日下午7:13:40 
 * Copyright (c) 2016, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.quest.entity.ApiResult;

/** 
 * @ClassName: FastJsonDemo
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2016年12月25日 下午7:13:40
 */
public class FastJsonDemo {
	@Test
	public void toJSONString(){
		ApiResult result = new ApiResult("1.0.0", 12345);
		String out = JSON.toJSONString(result);
		System.out.println(out);
		System.out.println(result.toString());
	}
	@Test
	public void parse(){
//		ApiResult result = new ApiResult("1.0.0", 12345);
		String input = "{name:库里,age:28}";
		Profile out = JSON.parseObject(input,Profile.class);
		System.out.println(out);
	}
	public class Profile{
		public String name;
		public int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
	}
}
