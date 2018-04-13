package com.chw.factory_pattern.simple_factory;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月13日
 * 描述：奔驰类，实现汽车接口
 * 		ConcreteProduct(具体产品)：抽象产品的具体化
 */
public class BenChi implements Car {

	@Override
	public void color() {
		System.out.println("白色");
	}

	@Override
	public void type() {
		System.out.println("SUV");
	}

}
