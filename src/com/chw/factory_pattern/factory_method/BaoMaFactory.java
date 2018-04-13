package com.chw.factory_pattern.factory_method;

import com.chw.factory_pattern.simple_factory.BaoMa;
import com.chw.factory_pattern.simple_factory.Car;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月13日
 * 描述：宝马工厂，继承汽车工厂来实现生产具体的汽车
 */
public class BaoMaFactory extends CarFactory {

	@Override
	public Car makeCar() {
		BaoMa baoMa = new BaoMa();
		System.out.println("======baoMa======");
		baoMa.color();
		baoMa.type();
		return baoMa;
	}

}
