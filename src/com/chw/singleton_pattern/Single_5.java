package com.chw.singleton_pattern;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月2日
 * 描述：静态内部类实现单例模式
 * 		和饿汉模式类似，两者都是通过类装载机制来保证初始化实例的时候只有一个线程，从而避免线程安全问题，饿汉模式的Singleton类被加载，
 * 		就会实例化，而静态内部类这种，当Singleton类被加载时，不会立即实例化，调用getInstance方法，才会装载SingletonHolder
 * 		类，从而完成Singleton的实例化。
 */
public class Single_5 {
	
	private Single_5() {}
	
	public static final Single_5 getInstace() {
		return Single_5_Holder.INSTANCE;
	}
	
	/**
	 * 
	 * @author 陈汉文
	 * @time 2018年4月2日
	 * 描述：静态内部类
	 */
	private static class Single_5_Holder {
		private static final Single_5 INSTANCE = new Single_5();
	}
}
