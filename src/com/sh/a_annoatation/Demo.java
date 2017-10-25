package com.sh.a_annoatation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sh.bean.User;

/**
 * @author Amaze_lee
 * @date 2017年10月20日 下午9:29:43 
 * @version V1.0  
 * @Description: 
 */
public class Demo {
	@Test
	public void fun1() {
		
		//1.创建容器对象
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.向容器要user对象
		User user = (User) ac.getBean("user");
		//打印user
		System.out.println(user);
		
		ac.close();
	}
}
