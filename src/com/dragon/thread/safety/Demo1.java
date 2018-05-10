package com.dragon.thread.safety;

/**
 * 线程优先级
 */
public class Demo1 {
	public static void main(String[] args) {

		Thread t1 = new Thread(new Target());
		Thread t2 = new Thread(new Target());

		//线程的优先级，最大值是10，最小是1
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();
	}
}
