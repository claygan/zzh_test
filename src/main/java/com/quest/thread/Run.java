package com.quest.thread;

public class Run {

	public static void main(String[] args) {
		HasSelfPrivateNum num = new HasSelfPrivateNum();
		HasSelfPrivateNum num2 = new HasSelfPrivateNum();
		ThreadA threadA = new ThreadA(num);
		ThreadB threadB = new ThreadB(num2);
		threadA.start();
		threadB.start();
		
		
	}

}
