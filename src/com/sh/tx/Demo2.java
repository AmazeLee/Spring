package com.sh.tx;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sh.service.AccountService;

/**
 * @author Amaze_lee
 * @date 2017年10月23日 下午5:13:41 
 * @version V1.0  
 * @Description: 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class Demo2 {
	
	@Resource(name="accountService")
	private AccountService as;
	@Test
	public void fun1() {
		as.transfer(1,2,200d);
	}
}
