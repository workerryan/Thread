package com.dragon.thread.safety.singleton;

/**
 * 饿汉式单例。饿汉式比较饥饿，所以在一开始就会实例化好
 */
public class Singleton {

	//为了保证示例的唯一，不能让别人去new出对象。
	private Singleton(){
	}
	
	//私有化的方法只能本类访问，其他类是访问不了的。
	private static Singleton instance = new Singleton();
	
	//既然不给其他人创建实例，那么就需要对外提供一个包含实例的方法
	public static Singleton getInstance(){
		return instance;
	}
	
}
