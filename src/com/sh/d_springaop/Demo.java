package com.sh.d_springaop;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sh.bean.User;
import com.sh.service.UserService;

/**
 * @author Amaze_lee
 * @date 2017年10月21日 下午10:18:45 
 * @version V1.0  
 * @Description: 
 */
//帮我们创建容器
@RunWith(SpringJUnit4ClassRunner.class)
//指定创建容器时使用哪个配置文件
@ContextConfiguration("classpath:com/sh/d_springaop/applicationContext.xml")
public class Demo {
	//将名为user的对象注入到u变量中
	@Resource(name="userService")
	private UserService us;
	
	@Test
	public void fun1() {
		us.add();
	}
	
}
