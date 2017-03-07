package com.quest.thread;

public class ThreadB extends Thread {
	private HasSelfPrivateNum privateNum;

	public ThreadB(HasSelfPrivateNum privateNum) {
		super();
		this.privateNum = privateNum;
	}

	@Override
	public void run() {
		super.run();
		privateNum.addI("b");
	}
	
}
