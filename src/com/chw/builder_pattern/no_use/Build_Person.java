package com.chw.builder_pattern.no_use;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月9日
 * 描述：
 */
public class Build_Person {

	public static void main(String[] args) {
		// 如果属性变多，将要很多个构造函数。
		Person_Product person_Product = new Person_Product();
		Person_Product person_Product2 = new Person_Product("张三", 28);
		Person_Product person_Product3 = new Person_Product("李四", 30, 178);
		Person_Product person_Product4 = new Person_Product("赵六", 40, 170, 140);
	}
}
