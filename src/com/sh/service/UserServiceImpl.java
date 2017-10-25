package com.sh.service;

/**
 * @author Amaze_lee
 * @date 2017年10月22日 下午3:50:37 
 * @version V1.0  
 * @Description: 
 */
public class UserServiceImpl implements UserService {

	@Override
	public void add() {
		System.out.println("保存用户");
	}

	@Override
	public void delete() {
		System.out.println("删除用户");
	}

	@Override
	public void update() {
		System.out.println("修改用户");
	}

	@Override
	public void find() {
		System.out.println("查找用户");

	}

}
