package com.quest.utils;

import java.security.MessageDigest;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * 使用加密解密工具类
 * 
 * @author JieHong
 * @date 2015年8月3日
 *
 */
public class EncryptedUtils {

	/** 十六进制下数字到字符的映射数组 */
	private static final String[] hexDigits = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

	/**
	 * MD5加密
	 * 
	 * @param password
	 *            待加密的字符串
	 * @return
	 */
	public static String encryptByMD5(String password) {
		return encodeByMD5(password);
	}

	/**
	 * 验证输入的密码是否正确
	 * 
	 * @param key
	 *            真正的密码（加密后的真密码）
	 * @param password
	 *            输入的字符串
	 * @return
	 */
	public static boolean authenticatePassword(String key, String password) {
		if (key.equals(encodeByMD5(password))) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 对字符串进行MD5编码
	 * 
	 * @param originString
	 * @return
	 */
	private static String encodeByMD5(String originString) {
		if (originString != null) {
			try {
				MessageDigest md = MessageDigest.getInstance("MD5");
				byte[] results = md.digest(originString.getBytes());
				String resultString = byteArrayToHexString(results);
				return resultString;
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * 转换字节数组为16进制字串
	 * 
	 * @param b
	 *            字节数组
	 * @return 十六进制字串
	 */
	private static String byteArrayToHexString(byte[] b) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
		}
		return resultSb.toString();
	}

	/**
	 * 将一个字节转化成16进制形式的字符串
	 * 
	 * @param b
	 * @return
	 */
	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0)
			n = 256 + n;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}

	/**
	 * BASE64解密
	 * 
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static String decryptByBase64(String key) throws Exception {
		return new String((new BASE64Decoder()).decodeBuffer(key));
	}

	/**
	 * BASE64加密
	 * 
	 * @param password 待加密的密码
	 * @return
	 * @throws Exception
	 */
	public static String encryptByBase64(String password) throws Exception {
		return (new BASE64Encoder()).encodeBuffer(password.getBytes());
	}

}
