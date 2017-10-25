package com.sh.service;

/**
 * @author Amaze_lee
 * @date 2017年10月23日 下午5:03:56 
 * @version V1.0  
 * @Description: 
 */
public interface AccountService {
	
	//转账方法
	void transfer(Integer from,Integer to,Double money);
}
