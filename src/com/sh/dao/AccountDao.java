package com.sh.dao;

/**
 * @author Amaze_lee
 * @date 2017年10月23日 下午4:54:07
 * @version V1.0
 * @Description:
 */
public interface AccountDao {

	// 加钱
	void addMoney(Integer id, Double money);

	// 减钱
	void decreaseMoney(Integer id, Double money);
}
