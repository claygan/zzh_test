/**
 * Project Name: questTestDemo
 * File Name: ApiResult.java
 * Package Name: com.quest.entity
 * Date: 2016年12月5日下午3:57:28 
 * Copyright (c) 2016, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.entity;
/** 
 * @ClassName: ApiResult
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2016年12月5日 下午3:57:28
 */
public class ApiResult {
	private final String version;
	private final long userId;
	public ApiResult(String version, long userId){
		this.version = version;
		this.userId = userId;
	}
	public String getVersion() {
		return version;
	}
	public long getUserId() {
		return userId;
	}
	
	@Override
	public String toString() {
		return "ApiResult [version=" + version + ", userId=" + userId + "]";
	}
	
}
