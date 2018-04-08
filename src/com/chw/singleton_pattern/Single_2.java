package com.chw.singleton_pattern;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月2日
 * 描述：懒汉模式（线程不安全，不可用）
 * 		尽管达到了懒加载，但是却存在线程安全问题，比如有两个线程，刚好都执行完if (instance == null)，接着
 * 		准备执行instance = new Single_2()语句，这样的结果会导致我们实例化了两个Single_2对象，这就是
 * 		懒汉模式可能引发的线程安全问题，解决这个方法，我们可以对getInstance方法加锁。
 */
public class Single_2 {
	
	private static Single_2 instance = null;
	
	private Single_2() {}
	
	public static Single_2 getInstance() {
		if (instance == null) {
			instance = new Single_2();
		}
		return instance;
	}
}
