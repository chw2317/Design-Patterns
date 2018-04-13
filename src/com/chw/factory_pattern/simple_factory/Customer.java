package com.chw.factory_pattern.simple_factory;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月13日
 * 描述：人要买车
 */
public class Customer {

	public static void main(String[] args) {
//		Car benchi = CarFactory.makeCar("benchi");
//		benchi.color();
//		benchi.type();
//
//		Car baoma = CarFactory.makeCar("baoma");
//		baoma.color();
//		baoma.type();
		
		Car benchi = CarFactory.makeCarByReflect(BenChi.class);
		benchi.color();
		benchi.type();
		
		Car baoma = CarFactory.makeCarByReflect(BaoMa.class);
		baoma.color();
		baoma.type();
	}
}
