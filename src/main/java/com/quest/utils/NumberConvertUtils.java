/**
 * Project Name: questTestDemo
 * File Name: NumberConvertUtils.java
 * Package Name: com.quest.utils
 * Date: 2017年1月12日上午10:28:20 
 * Copyright (c) 2017, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.utils;

import java.util.Arrays;

/** 
 * @ClassName: NumberConvertUtils
 * @Description: 数字转中文
 * 
 * @author ganshimin@zhongzhihui.com
 * @date: 2017年1月12日 上午10:28:20
 */
public class NumberConvertUtils {
	/** 
	 * @Title: toChineseNum
	 * @Description: 长浮点型转中文
	 * @author ganshimin@zhongzhihui.com
	 * @param oNum
	 * @return  
	 */  
	public static String toChineseNum(double oNum){
		StringBuffer sb = new StringBuffer();
		java.text.NumberFormat nf = java.text.NumberFormat.getInstance(); 
		System.out.println(String.valueOf(nf.format(oNum)));
		String[] nNum = String.valueOf(nf.format(oNum)).split("\\.");
		//整数部分
		char[] cArray = nNum[0].toCharArray();
		//小数部分
		char[] decimalArray = new char[]{};
		if(nNum.length > 1){
			if(Integer.parseInt(nNum[1]+"") > 0){
				decimalArray = nNum[1].toCharArray();
			}
			System.out.println(Arrays.toString(decimalArray));
		}
		//整数转换
		sb = integerConvert(cArray);
		//小数点后处理
		if(decimalArray.length > 0){
			sb.append("点");
			for(char c : decimalArray){
				sb.append(numToChinese(c));
			}
		}
 		return sb.toString();
	}
	/** 
	 * @Title: toChineseNum
	 * @Description: 长整整转中文
	 * @author ganshimin@zhongzhihui.com
	 * @param oNum
	 * @return  
	 */  
	public static String toChineseNum(long oNum){
		char[] cArray = String.valueOf(oNum).toCharArray();
 		return integerConvert(cArray).toString();
	}
	/** 
	 * @Title: toChineseNum
	 * @Description: 整型转中文
	 * @author ganshimin@zhongzhihui.com
	 * @param oNum
	 * @return  
	 */  
	public static String toChineseNum(int oNum){
		return toChineseNum((long)oNum);
	}
	public static String numToChinese(char singleNum){
		switch(singleNum){
			case '0':return "零";
			case '1':return "一";
			case '2':return "二";
			case '3':return "三";
			case '4':return "四";
			case '5':return "五";
			case '6':return "六";
			case '7':return "七";
			case '8':return "八";
			case '9':return "九";
		}
			return "";
	}
	public static String digitToChinese(int digit){
		switch(digit){
			case 1:return "十";
			case 2:return "百";
			case 3:return "千";
		}
		return "";
	}
	public static String bigDigitToChinese(int digit){
		switch(digit){
			case 1:return "万";
			case 2:return "亿";
			case 3:return "兆";
			case 4:return "京";
			case 5:return "垓";
			case 6:return "秭";
			case 7:return "穰";
			case 8:return "沟";
			case 9:return "涧";
			case 10:return "正";
			case 11:return "载";
			case 12:return "极恒河沙";
			case 13:return "阿僧只";
			case 14:return "那由他";
			case 15:return "不可思议";
		}
		return "";
	}
	/** 
	 * @Title: integerConvert
	 * @Description: 整数转换
	 * @author ganshimin@zhongzhihui.com
	 * @param cArray
	 * @return  
	 */  
	public static StringBuffer integerConvert(char[] cArray){
		StringBuffer sb = new StringBuffer();
		//缓存数字
		StringBuffer cacheNum = new StringBuffer();
		//缓存位数
		StringBuffer cacheDigit = new StringBuffer();
		//转中文
		for(int i=0,len=cArray.length;i<len;i++){
			//换算成位数
			int digit = (cArray.length-1) - i;
			//获取可比较的数字
			int element = Integer.parseInt(cArray[i]+"");
			//遇到0先缓存
			if(element == 0){
				//存入缓存位数
				if(cacheDigit.length() == 0){
					if(digit%4 == 0){
						cacheDigit.append(bigDigitToChinese(digit/4));
					}
				}
				//存入缓存数字
				if(cacheNum.length() == 0){
					cacheNum.append("零");
				}
				if(digit == 0){
					//最后全是零，需要保留大数位
					sb.append(cacheDigit);
				}
				continue;
			}
			if(element > 0){
				//直到下一位非0，才会取出缓存中的0
				if(cacheNum.length() > 0){
					//取出缓存位数
					sb.append(cacheDigit);
					//取出缓存数
					sb.append(cacheNum);
					//清除缓存
					cacheNum.delete(0, cacheNum.length());
					cacheDigit.delete(0, cacheDigit.length());
				}
				//存入数字
				sb.append(numToChinese(cArray[i]));
				//存入位数
				if(digit%4 == 0){
					sb.append(bigDigitToChinese(digit/4));
				}else{
					sb.append(digitToChinese(digit%4));
				}
			}
		}
		return sb;
	}
	public static void main(String[] args) {
		System.out.println(NumberConvertUtils.toChineseNum(100000000L));
	}
}
