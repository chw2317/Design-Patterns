package com.chw.builder_pattern.no_use;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月9日
 * 描述：对象
 */
public class Person_Product {

	private String name;	// 名字
	private int age;		// 年龄
	private double height;	// 身高
	private double weight;	// 体重
	
	/**
	 * 用于构建不同的情况
	 */
	public Person_Product() {
		super();
	}
	
	/**
	 * 用于构建不同的情况
	 * 
	 * @param name
	 * @param age
	 */
	public Person_Product(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * 用于构建不同的情况
	 * 
	 * @param name
	 * @param age
	 * @param height
	 */
	public Person_Product(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	/**
	 * 用于构建不同的情况
	 * 
	 * @param name
	 * @param age
	 * @param height
	 * @param weight
	 */
	public Person_Product(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
