package com.chw.builder_pattern.standard;

import com.chw.builder_pattern.no_use.Person_Product;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月9日
 * 描述：具体的建造者对象
 */
public class ConcreteBuilder extends Builder {

	private Person_Product person_Product = new Person_Product();
	
	@Override
	public void buildName() {
		person_Product.setName(this.name);
	}

	@Override
	public void buildAge() {
		person_Product.setAge(this.age);
	}

	@Override
	public void buildHeight() {
		person_Product.setHeight(this.height);
	}

	@Override
	public void buildWeight() {
		person_Product.setWeight(this.weight);
	}

	@Override
	public Person_Product getResult() {
		return person_Product;
	}

}
