package com.dragon.thread.creat;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo4 implements Callable<Integer>{

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Demo4 demo4 = new Demo4();
		FutureTask<Integer> task = new FutureTask<>(demo4);
		
		Thread thread = new Thread(task);
		thread.start();
		
		System.out.println("我先干点其他事。。。");
		
		Integer result = task.get();
		System.out.println("result = " + result);
	}
	
	@Override
	public Integer call() throws Exception {
		System.out.println("正在计算。。。");
		Thread.sleep(3000);
		return 1;
	}
}
