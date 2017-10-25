package com.sh.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Amaze_lee
 * @date 2017年10月20日 下午5:29:08 
 * @version V1.0  
 * @Description: 
 */
@Component("car")
public class Car {
	@Value("兰博基尼")
	private String name;
	@Value("天空蓝")
	private String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + "]";
	}
	
	
}
