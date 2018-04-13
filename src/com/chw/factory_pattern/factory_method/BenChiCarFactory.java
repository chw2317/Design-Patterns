package com.chw.factory_pattern.factory_method;

import com.chw.factory_pattern.simple_factory.BenChi;
import com.chw.factory_pattern.simple_factory.Car;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月13日
 * 描述：奔驰工厂，继承汽车工厂来实现生产具体的汽车
 */
public class BenChiCarFactory extends CarFactory {

	@Override
	public Car makeCar() {
		BenChi benChi = new BenChi();
		System.out.println("======benChi======");
		benChi.color();
		benChi.type();
		return benChi;
	}
}
