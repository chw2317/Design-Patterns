package com.chw.builder_pattern.standard;

/**
 * 
 * @author 陈汉文
 * @time 2018年4月9日
 * 描述：用于指导建造的过程
 */
public class Director {

	/**
	 * 调用所有构建过程进行构建
	 * 
	 * @param builder
	 */
	public void construct(Builder builder) {
		builder.buildName();
		builder.buildAge();
		builder.buildHeight();
		builder.buildWeight();
	}
}
