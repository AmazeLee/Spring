package com.sh.bean;

/**
 * @author Amaze_lee
 * @date 2017年10月20日 上午10:53:00 
 * @version V1.0  
 * @Description: 
 */
public class User {
	
	private String name;
	private Integer age;
	private Car car;
	
	public User(String name, Integer age, Car car) {
		super();
		System.out.println("String name, Integer age, Car car");
		this.name = name;
		this.age = age;
		this.car = car;
	}
	
	public User(Integer age, Car car,String name) {
		super();
		System.out.println("Integer age, Car car,String name");
		this.name = name;
		this.age = age;
		this.car = car;
	}
	
	public User(Integer age, Car car,Integer name) {
		super();
		System.out.println("Integer age, Car car,Integer name");
		this.name = name+"";
		this.age = age;
		this.car = car;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public User() {
		System.out.println("User对象空参构造方法");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void init() {
		System.out.println("init......");
	}
	public void destroy() {
		System.out.println("destroy......");
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
	
}
