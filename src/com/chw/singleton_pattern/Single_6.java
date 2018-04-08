package com.chw.singleton_pattern;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月2日
 * 描述：枚举实现单例模式
 * 		访问方式：SingletonEnum.INSTANCE.method();
 * 		INSTANCE即为SingletonEnum类型的引用，得到它就可以调用枚举中的方法。既避免了线程安全问题，还能防止反序列化
 * 		重新创建新的对象，但是失去了类的一些特性，没有延时加载。
 */
public class Single_6 {
	
	public enum SingletonEnum {
		INSTANCE;
		
		private Single_6 instance;
		
		SingletonEnum() {
			instance = new Single_6();
		}
		
		public Single_6 getInstance() {
			return instance;
		}
	}
}
