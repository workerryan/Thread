package com.dragon.thread.creat;

import java.util.Arrays;
import java.util.List;

/**
 * 使用Lambda创建线程
 */
public class Demo7 {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(10,20,30,40);
		int result = new Demo7().add(values);
		System.out.println(result);
	}
	
	public int add(List<Integer> values){
		values.parallelStream().forEach(System.out :: println);
		return values.parallelStream().mapToInt(a -> a).sum();
	}
}
