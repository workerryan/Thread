package com.dragon.thread.safety;

public class Target implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName() + " ...");
		}
	}
}