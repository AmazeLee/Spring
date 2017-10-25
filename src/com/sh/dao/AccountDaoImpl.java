package com.sh.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @author Amaze_lee
 * @date 2017年10月23日 下午4:56:38 
 * @version V1.0  
 * @Description: 
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{

	@Override
	public void addMoney(Integer id, Double money) {
		getJdbcTemplate().update("update t_account set money=money+? where id=?",money,id);
	}

	@Override
	public void decreaseMoney(Integer id, Double money) {
		getJdbcTemplate().update("update t_account set money=money-? where id=?",money,id);
	}

}
