package com.sh.c_injection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sh.bean.User;

/**
 * @author Amaze_lee
 * @date 2017年10月20日 下午5:23:29
 * @version V1.0
 * @Description:
 */
public class Demo {
	@Test
	// 创建方式1：空参构造
	public void fun1() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/sh/c_injection/applicationContext.xml");
		// 2.向容器要user对象
		User user = (User) ac.getBean("user");
		// 打印user
		System.out.println(user);
	}
	
	@Test
	public void fun2() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/sh/c_injection/applicationContext.xml");
		// 2.向容器要user对象
		User user2 = (User) ac.getBean("user2");
		// 打印user
		System.out.println(user2);
	}
	
	@Test
	public void fun3() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/sh/c_injection/applicationContext.xml");
		// 2.向容器要user对象
		User user3 = (User) ac.getBean("user3");
		// 打印user
		System.out.println(user3);
	}
	
	@Test
	public void fun4() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/sh/c_injection/applicationContext.xml");
		// 2.向容器要user对象
		User user4 = (User) ac.getBean("user4");
		// 打印user
		System.out.println(user4);
	}
	
	@Test
	public void fun5() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/sh/c_injection/applicationContext.xml");
		// 2.向容器要user对象
		CollectionBean cb = (CollectionBean) ac.getBean("cb");
		// 打印user
		System.out.println(cb);
	}
}
