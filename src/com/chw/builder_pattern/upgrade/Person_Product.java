package com.chw.builder_pattern.upgrade;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月9日
 * 描述：将Director和Builder的角色跟Product的角色进行合并。
 */
public class Person_Product {
	
	private String name;	// 名字
	private int age;		// 年龄
	private double height;	// 身高
	private double weight;	// 体重
	
	public Person_Product() {
		super();
	}
	
	/**
	 * Director的Controuct()方法以构造函数的形式出现。
	 * 
	 * @param builder
	 */
	public Person_Product(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.height = builder.height;
		this.weight = builder.weight;
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
	
	/**
	 * 
	 * @author 陈汉文
	 * @time 2018年4月9日
	 * 描述：Builder对象以一个内部类的形式出现。
	 */
	public static class Builder {
		
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
		
		public Person_Product build() {
			Person_Product person_Product = new Person_Product(this);
			return person_Product;
		}
	}
	
}
