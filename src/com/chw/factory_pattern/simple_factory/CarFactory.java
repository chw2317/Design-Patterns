package com.chw.factory_pattern.simple_factory;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月13日
 * 描述：汽车工厂，根据汽车种类生产对应的汽车
 * 		Factory（工厂）：实现创建所有产品实例的内部逻辑
 */
public class CarFactory {

	public static Car makeCar(String type) {
		if (type.equals("benchi")) {
			System.out.println("======BenChi======");
			Car benchi = new BenChi();
			return benchi;
		} else if (type.equals("baoma")) {
			System.out.println("======BaoMa======");
			Car baoma = new BaoMa();
			return baoma;
		} else {
			System.out.println("暂时生产不出该车型");
			return null;
		}
	}
	
	public static <T extends Car> T makeCarByReflect(Class<T> clz) {
		System.out.println("======" + clz.getName() + "======");
		Car car = null;
		try {
			car = (Car) Class.forName(clz.getName()).newInstance();
		} catch (InstantiationException e) {
			System.out.println("不支持抽象类或接口");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println("没有足够权限，即不能访问私有对象");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("类不存在");
			e.printStackTrace();
		}
		return (T) car;
	}
}


































