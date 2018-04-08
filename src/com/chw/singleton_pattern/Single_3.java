package com.chw.singleton_pattern;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月2日
 * 描述：懒汉模式（线程安全，但效率低，不推荐使用）
 * 		尽管保证了线程安全，但是每个线程在想要获得实例时，执行getInstance()方法都需要进行同步，而实例化代码只需执行一次就够了，
 * 		后面获取该实例，直接return即可，方法进行同步效率太低。
 */
public class Single_3 {
	
	private static Single_3 instance = null;
	
	private Single_3() {}
	
	public static synchronized Single_3 getInstance() {
		if (instance == null) {
			instance = new Single_3();
		}
		return instance;
	}
}
