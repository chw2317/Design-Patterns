package com.chw.builder_pattern.standard;

import com.chw.builder_pattern.no_use.Person_Product;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月9日
 * 描述：调用
 */
public class Standard {

	public static void main(String[] args) {
		// Builder链式构建，然后传给Director进行构建。
		// Person这个对象的构建和表示是分开的，两者没有耦合。
		Builder builder = new ConcreteBuilder()
				.setName("张三")
				.setAge(15)
				.setHeight(170)
				.setWeight(130);
		Director director = new Director();
		director.construct(builder);
		
		Person_Product person_Product = builder.getResult();
		System.out.println("姓名：" + person_Product.getName() + "\n年龄：" + person_Product.getAge()
				+ "\n身高：" + person_Product.getHeight() + "\n体重：" + person_Product.getWeight());
	}
}
