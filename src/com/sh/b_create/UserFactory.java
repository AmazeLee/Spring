package com.sh.b_create;

import com.sh.bean.User;

/**
 * @author Amaze_lee
 * @date 2017年10月20日 下午3:12:30 
 * @version V1.0  
 * @Description: 
 */
public class UserFactory {
	
	public static User createUser() {
		System.out.println("静态工厂创建User");
		return new User();
	}
	
	public User createUser2() {
		System.out.println("实例工厂创建User");
		return new User();
	}
}
