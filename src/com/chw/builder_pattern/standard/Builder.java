package com.chw.builder_pattern.standard;

import com.chw.builder_pattern.no_use.Person_Product;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月9日
 * 描述：抽象建造者Builder对象，定义一个统一的构建过程。
 */
public abstract class Builder {

	public String name;		// 名字
	public int age;			// 年龄
	public double height;	// 身高
	public double weight;	// 体重
	
	public Builder setName(String name) {
		this.name = name;
		return this;
	}
	
	public Builder setAge(int age) {
		this.age = age;
		return this;
	}
	
	public Builder setHeight(double height) {
		this.height = height;
		return this;
	}
	
	public Builder setWeight(double weight) {
		this.weight = weight;
		return this;
	}
	
	// 用于具体的实现逻辑
	public abstract void buildName();
	public abstract void buildAge();
	public abstract void buildHeight();
	public abstract void buildWeight();
	public abstract Person_Product getResult();
}
