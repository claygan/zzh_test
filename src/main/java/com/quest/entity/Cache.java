/**
 * Project Name: questTestDemo
 * File Name: Cache.java
 * Package Name: com.quest.entity
 * Date: 2016年12月5日下午3:46:42 
 * Copyright (c) 2016, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.entity;
/** 
 * @ClassName: Cache
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2016年12月5日 下午3:46:42
 */
public class Cache {
	private int cache;
	public Cache(int cache){
		this.cache = cache;
	}
	public int getCache() {
		return cache;
	}
	public void setCache(int cache) {
		this.cache = cache;
	}
	@Override
	public String toString() {
		return "Cache [cache=" + cache + "]";
	}
	
}
