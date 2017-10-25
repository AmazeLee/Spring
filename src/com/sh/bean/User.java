package com.sh.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author Amaze_lee
 * @date 2017年10月20日 上午10:53:00 
 * @version V1.0  
 * @Description: 
 */
@Component("user")
	@Service("user")//service层
	@Controller("user")//web层
	@Repository("user")//dao层
//指定对象的作用域
@Scope(scopeName="singleton")
public class User {
	@Value("沙和尚")
	private String name;
	private Integer age;
	//@Autowired//自动装配
	//问题：如果匹配多个类型一致的对象，将无法选择具体注入哪一个对象
	//@Qualifier("car2")//使用@Qualifier注解告诉spring自动装配哪一个名称的对象
	@Resource(name="car2")//手动注入，指定注入哪个名称的对象
	private Car car;
	
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
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
	@PostConstruct //在对象被创建后调用 相当于init-method
	public void init() {
		System.out.println("init......");
	}
	@PreDestroy //在销毁之前调用 相当于destroy-method
	public void destroy() {
		System.out.println("destroy......");
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
	
}
