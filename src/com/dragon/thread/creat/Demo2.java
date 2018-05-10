package com.dragon.thread.creat;

/**
 * 通过实现Runnable接口创建线程
 * @author wanglei
 *
 */
public class Demo2 implements Runnable {

	@Override
	public void run() {
		while(true){
			System.out.println("thread running ... ");
		}
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread(new Demo2());
		thread.start();
	}
}
