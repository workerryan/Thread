package com.dragon.thread.safety.singleton;

/**
 * 懒汉式单例
 */
public class Singleton2 {

	private Singleton2() {
	}

	//懒汉式比较懒，并不会在加载的时候实例化。这里加上volatile是为了避免指令重排序带来的安全性问题
	private static volatile Singleton2 instance;

	public static  Singleton2 getInstance() {
		// 自旋 while(true)
		if (instance == null) {
			synchronized (Singleton2.class) {
				if (instance == null) {
					instance = new Singleton2(); // 指令重排序
	
					// 申请一块内存空间 // 1
					// 在这块空间里实例化对象 // 2
					// instance的引用指向这块空间地址 // 3
				}
			}
		}
		return instance;
	}
}
