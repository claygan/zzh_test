/**
 * Project Name: questTestDemo
 * File Name: CryptoDemo.java
 * Package Name: com.quest.demo
 * Date: 2016年12月19日下午9:55:52 
 * Copyright (c) 2016, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.demo;

import org.junit.Test;

import com.quest.utils.CryptoUtil;
import com.quest.utils.EncryptedUtils;

/** 
 * @ClassName: CryptoDemo
 * @Description: TODO(用一句话描述这个类)
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2016年12月19日 下午9:55:52
 */
public class CryptoDemo {
	@Test
	public void test(){
		String pwd = "123456";
		System.out.println(pwd);
		String pwd1 = CryptoUtil.encrypt(pwd);
		System.out.println(pwd1);
		String pwd2 = CryptoUtil.dectypt(pwd1);
		System.out.println(pwd2);
	}
	@Test
	public void test1(){
		String pwd = "123456";
		System.out.println(pwd);
		try {
			String pwd1 = EncryptedUtils.encryptByBase64(pwd);
			System.out.println(pwd1);
			String pwd2 = EncryptedUtils.decryptByBase64(pwd1);
			System.out.println(pwd2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test2(){
		String pwd = "123456";
		System.out.println(pwd);
		String _pwd = CryptoUtil.encrypt(pwd);
		try {
			String pwd1 = EncryptedUtils.encryptByBase64(_pwd);
			System.out.println(pwd1);
			String pwd2 = CryptoUtil.dectypt(EncryptedUtils.decryptByBase64(pwd1));
			System.out.println(pwd2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void sfgcPwd(){
//		String pwd = "123456";
		String pwd = "NcswJ@)!^";
		String clear = "clearPvAndUv";
		try {
			String outputPwd = EncryptedUtils.encryptByMD5(clear);
			System.out.println(">>>>>>>>>>>>>>> "+outputPwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
