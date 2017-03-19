/**
 * Project Name: questTestDemo
 * File Name: HttpConnectionTest.java
 * Package Name: com.quest.demo
 * Date: 2017年2月16日上午11:06:41 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.naming.spi.Resolver;

import com.quest.demo.MyArrayListStuart.Main;

/** 
 * @ClassName: HttpConnectionTest
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年2月16日 上午11:06:41
 */
public class HttpConnectionTest {
	private static final String path = "http://www.hzecps.org/ven/service/listService?typeName=vendor&serviceScope=0&type=1&page=1&keyWords=";
	public static String resolve(){
		BufferedReader bufferedReader = null;
		HttpURLConnection httpURLConnection = null;
		try {
			URL url = new URL(path);
			httpURLConnection = (HttpURLConnection)url.openConnection();
			httpURLConnection.setRequestMethod("GET");
			httpURLConnection.connect();
			httpURLConnection.setConnectTimeout(200);
			httpURLConnection.setReadTimeout(200);
			bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
			//读取返回内容
			StringBuffer buffer = new StringBuffer();
			String line = null;
			while((line = bufferedReader.readLine()) != null){
				buffer.append(line).append("\n");
			}
			if (buffer.length() != 0) {
				buffer.deleteCharAt(buffer.length() - 1);
                return buffer.toString();
            }
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.println(HttpConnectionTest.resolve());
	}
	
}
