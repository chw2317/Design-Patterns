package com.chw.factory_pattern.factory_method;

import com.chw.factory_pattern.simple_factory.Car;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月13日
 * 描述：去掉简单工厂模式中工厂方法的静态属性，使得它可以被子类继承。这样在简单工厂模式里集中在工厂方法上的压力
 * 		可以由工厂方法模式里不同的工厂子类来分担。
 */
public abstract class CarFactory {

	public abstract Car makeCar();
}
