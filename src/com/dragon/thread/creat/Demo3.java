package com.dragon.thread.creat;

/**
 * 通过匿名内部类创建线程
 */
public class Demo3 {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				System.out.println("running 1");
			}
		}.start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("running 2");
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("running 3");
			}
		}) {
			@Override
			public void run() {
				System.out.println("running 4");
			}
		}.start();
	}
}
