package com.sh.bean;

/**
 * @author Amaze_lee
 * @date 2017年10月20日 下午5:29:08 
 * @version V1.0  
 * @Description: 
 */
public class Car {
	private String name;
	private String color;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
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
