package com.dragon.thread.creat;

/**
 * 通过继承Thread类来实现一个线程
 * @author wanglei
 *
 */
public class Demo1 extends Thread{
	public Demo1(String name){
		super(name);
	}
	
	@Override
	public void run() {
//		while(true){
//			System.out.println(getName() + "线程执行了");
//		}
		while(!interrupted()){
			System.out.println(getName() + "线程执行了");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String[] args) {
		Demo1 demo1 = new Demo1("first-thread");
		Demo1 demo2 = new Demo1("second-thread");
		
		demo1.start();
		demo2.start();
		
		//通过interrupt()来中断线程，配置interrupted()来判断线程是否中断，是推荐的线程中断处理方式
		demo1.interrupt();
	}
}
