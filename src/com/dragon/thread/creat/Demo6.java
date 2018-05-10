package com.dragon.thread.creat;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 使用线程池创建线程
 * @author wanglei
 */
public class Demo6 {
	public static void main(String[] args) {
//		ExecutorService threadPool = Executors.newFixedThreadPool(10);
		ExecutorService threadPool = Executors.newCachedThreadPool();
		for(int i = 0; i < 100; i++){
			threadPool.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread());
				}
			});
		}
		
		//停掉线程池
		threadPool.shutdown();
	}
}
