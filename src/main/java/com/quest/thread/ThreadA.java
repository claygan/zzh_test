package com.quest.thread;

public class ThreadA extends Thread {
	private HasSelfPrivateNum privateNum;

	public ThreadA(HasSelfPrivateNum privateNum) {
		super();
		this.privateNum = privateNum;
	}

	@Override
	public void run() {
		super.run();
		privateNum.addI("a");
	}
	
}
