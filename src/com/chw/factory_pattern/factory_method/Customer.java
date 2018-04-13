package com.chw.factory_pattern.factory_method;


/**
 * 
 * @author 陈汉文
 * @time 2018年4月13日
 * 描述：人要买车
 */
public class Customer {

	public static void main(String[] args) {
		BenChiCarFactory benChiCarFactory = new BenChiCarFactory();
		benChiCarFactory.makeCar();
		
		BaoMaFactory baoMaFactory = new BaoMaFactory();
		baoMaFactory.makeCar();
	}
}
