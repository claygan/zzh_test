/**
 * Project Name: zzh-live-service
 * File Name: CryptoUtil.java
 * Package Name: com.zzh.live.core.utils
 * Date: 2015-6-12下午1:46:22 
 * Copyright (c) 2015, www.zhongzhihui.com All Rights Reserved. 
 */

package com.quest.utils;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

/**
 * ClassName: CryptoUtil Description: 加密/解密工具
 * 
 * @author jupiter@zhongzhihui.com
 * @date: 2015-6-12 下午1:46:22
 */
public class CryptoUtil {

	private static final String _ALGORITHM = "Blowfish";

	private static final String _TRANSFORMATION = "Blowfish/CBC/NoPadding";

	private static final String _KEY = "fdsd2342@43!$%^&*)(dddfs;l1,ndwiwoqkxkxkqapq}[;'";

//	private static final String _PROVIDER = "CryptixCrypto";

	static {
		java.security.Security.addProvider(new cryptix.jce.provider.CryptixCrypto());
	}

	private static final ThreadLocal<JavaCrypto> local = new ThreadLocal<JavaCrypto>();

	private static String blank = "            ";

	private static JavaCrypto getLocalCrypto() {
		JavaCrypto current = local.get();
		if (current == null) {
			current = new JavaCrypto(_ALGORITHM, _TRANSFORMATION, _KEY, null);
			local.set(current);
		}
		return current;
	}

	private static class JavaCrypto {
		private Cipher enCipher;

		private Cipher deCipher;

		public JavaCrypto(String algorithm, String transformation, String key, String provider) {
			super();
			try {
				SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), algorithm);
				if (provider == null) {
					enCipher = Cipher.getInstance(transformation);
					deCipher = Cipher.getInstance(transformation);
				} else {
					enCipher = Cipher.getInstance(transformation, provider);
					deCipher = Cipher.getInstance(transformation, provider);
				}
				enCipher.init(Cipher.ENCRYPT_MODE, secretKey);
				deCipher.init(Cipher.DECRYPT_MODE, secretKey);
			} catch (NoSuchAlgorithmException e) {
				throw new RuntimeException(e);
			} catch (NoSuchPaddingException e) {
				throw new RuntimeException(e);
			} catch (InvalidKeyException e) {
				throw new RuntimeException(e);
			} catch (NoSuchProviderException e) {
				throw new RuntimeException(e);
			}
		}

		public byte[] encrypt(byte[] bs) {
			try {
				return enCipher.doFinal(bs);
			} catch (IllegalBlockSizeException e) {
				throw new RuntimeException(e);
			} catch (BadPaddingException e) {
				throw new RuntimeException(e);
			}
		}

		public byte[] dectypt(byte[] bs) {
			try {
				return deCipher.doFinal(bs);
			} catch (IllegalBlockSizeException e) {
				throw new RuntimeException(e);
			} catch (BadPaddingException e) {
				throw new RuntimeException(e);
			}
		}
	}

	public static String dectypt(String s) {
		return dectypt(s, null);
	}

	public static String dectypt(String s, String charset) {
		if (s == null) {
			throw new NullPointerException("dectypt string can't be null");
		}
		try {
			byte[] bs = Base64.decodeBase64(s);
			String back = null;
			if (charset != null) {
				back = new String(bs, charset);
			} else {
				back = new String(bs);
			}
			back = back.substring(8, back.length()).trim();
			return back;
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	public static byte[] dectypt(byte[] bytes) {
		if (bytes == null) {
			throw new NullPointerException("dectypt bytes can't be null");
		}
		return getLocalCrypto().dectypt(bytes);
	}

	public static String encrypt(String s) {
		return encrypt(s, null);
	}

	public static String encrypt(String s, String charset) {
		if (s == null) {
			throw new NullPointerException("encrypt string can't be null");
		}
		s = blank + s + blank + blank.substring(0, (8 - s.length() % 8) % 8);
		try {
			byte[] bs;
			if (charset != null) {
				bs = s.getBytes(charset);
			} else {
				bs = s.getBytes();
			}
			return Base64.encodeBase64URLSafeString(bs);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	public static byte[] encrypt(byte[] bytes) {
		if (bytes == null) {
			throw new NullPointerException("encrypt bytes can't be null");
		}
		return getLocalCrypto().encrypt(bytes);
	}

	public static void main(String[] args) {
		String text = "show me the money";
		String encode = encrypt(text);
		System.out.println(encode);
		String decode = dectypt(encode);
		System.out.println(decode);

	}
}
