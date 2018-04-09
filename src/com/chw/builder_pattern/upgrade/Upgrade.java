package com.chw.builder_pattern.upgrade;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月9日
 * 描述：调用
 */
public class Upgrade {

	public static void main(String[] args) {
		Person_Product.Builder builder = new Person_Product.Builder();
		// 链式调用
		// 想要set哪个属性就set哪个属性。
		Person_Product person = builder.setName("张三")
				.setAge(30)
				.setHeight(169)
				.setWeight(145)
				.build();
	}
}
