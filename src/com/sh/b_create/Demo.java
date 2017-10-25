package com.sh.b_create;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sh.bean.User;

/**
 * @author Amaze_lee
 * @date 2017年10月20日 下午3:08:37 
 * @version V1.0  
 * @Description: 
 */
public class Demo {
	
	@Test
	//创建方式1：空参构造
	public void fun1() {	
		//1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/sh/b_create/applicationContext.xml");
		//2.向容器要user对象
		User user = (User) ac.getBean("user");
		//打印user
		System.out.println(user);
	}
	
	@Test
	//创建方式2：静态工厂构造
	public void fun2() {	
		//1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/sh/b_create/applicationContext.xml");
		//2.向容器要user对象
		User user = (User) ac.getBean("user2");
		//打印user
		System.out.println(user);
	}
	
	@Test
	//创建方式3：实例工厂构造
	public void fun3() {	
		//1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/sh/b_create/applicationContext.xml");
		//2.向容器要user对象
		User user = (User) ac.getBean("user3");
		//打印user
		System.out.println(user);
	}
}
