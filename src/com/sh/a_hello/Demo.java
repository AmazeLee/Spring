package com.sh.a_hello;

import java.io.FilterOutputStream;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sh.bean.User;

/**
 * @author Amaze_lee
 * @date 2017年10月20日 上午11:50:58 
 * @version V1.0  
 * @Description: 
 */
public class Demo {
	
	@Test
	public void fun1() {
		
		//1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.向容器要user对象
		User user = (User) ac.getBean("user");
		//打印user
		System.out.println(user);
	}
	
	@Test
	//scope:singleton 单例
	public void fun2() {
		
		//1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.向容器要user对象
		User user = (User) ac.getBean("user");
		User user2 = (User) ac.getBean("user");
		//打印user
		System.out.println(user==user2);//true
	}
	
	@Test
	//scope:prototype 多例
	public void fun3() {
		
		//1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.向容器要user对象
		User user = (User) ac.getBean("user");
		User user2 = (User) ac.getBean("user");
		//打印user
		System.out.println(user==user2);//false
	}
	
	@Test
	//测试生命周期
	public void fun4() {
		
		//1.创建容器对象
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.向容器要user对象
		User user = (User) ac.getBean("user");
		//打印user
		System.out.println(user);
		ac.close();
	}
}
