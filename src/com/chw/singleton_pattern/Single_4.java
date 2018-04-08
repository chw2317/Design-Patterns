package com.chw.singleton_pattern;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月2日
 * 描述：懒汉模式（双重校验锁）
 * 		代码中进行了两次if检查，这样就可以保证线程安全，初始化一次后，后面再次访问时，if检查，直接return实例化对象。volatile是1.5后引入的，
 * 		volatile关键字会屏蔽java虚拟机所做的一些代码优化，会导致系统运行效率降低，而更好的写法是使用静态内部类来实现单例。
 */
public class Single_4 {

	private static volatile Single_4 instance = null;
	
	private Single_4() {}
	
	public static Single_4 getInstance () {
		if (instance == null) {
			synchronized (Single_4.class) {
				if (instance == null) {
					instance = new Single_4();
				}
			}
		}
		return instance;
	}
}
