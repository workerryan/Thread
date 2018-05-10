package com.dragon.thread.safety;

/**
 * 实现一个序列生成器
 */
public class Sequence {
	
	private static int value;
	
	/**
	 * synchronized 放在普通方法上，内置锁就是当前类的实例
	 */
	public synchronized int getNext() {
		//value ++ 实际是2步： 第一步是将value+1，第二步是将+1后的值再赋值给value
		return value ++;
	}
	
	/**
	 * 修饰静态方法，内置锁是当前的Class字节码对象 Sequence.class
	 */
	public static synchronized int getPrevious(){
		return value --;
	}
	
	/**
	 * synchronized修饰代码块。修饰代码块的时候，其参数是一个Class对象。
	 * 所有持有这个对象的锁都可以进入这个代码块
	 */
	public int xx () {
		// monitorenter
		synchronized (Sequence.class) {
			if(value > 0) {
				return value;
			} else {
				return -1;
			}
		}
		// monitorexit
	}
	
	
	public static void main(String[] args) {
		Sequence s = new Sequence();
		
		//3个线程都去执行Sequence的方法
		new Thread( () -> {
			while(true) {
				System.out.println(Thread.currentThread().getName() + " " + s.getNext());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		}).start();
		
		new Thread( () -> {
			while(true) {
				System.out.println(Thread.currentThread().getName() + " " + s.getNext());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		}).start();
		
		new Thread( () -> {
			while(true) {
				System.out.println(Thread.currentThread().getName() + " " + s.getNext());
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		}).start();
	}

}