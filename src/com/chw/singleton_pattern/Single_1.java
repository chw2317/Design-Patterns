package com.chw.singleton_pattern;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月2日
 * 描述：饿汉模式
 * 			优点：类加载的时候就完成实例化，避免线程同步问题。
 * 			缺点：由于在类加载的时候就进行了实例化，所以没有达到Lazy Loading(懒加载)的效果，即使我们没用到这个实例，但是它还是会加载，
 * 				从而造成内存浪费（可以忽略）。
 * 			最常用的一种。
 */
public class Single_1 {
	
	private static Single_1 instance = new Single_1();
	
	private Single_1() {}
	
	public static Single_1 getInstance() {
		return instance;
	}
}
