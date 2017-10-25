package com.sh.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

import com.sh.dao.AccountDao;

/**
 * @author Amaze_lee
 * @date 2017年10月23日 下午5:06:01
 * @version V1.0
 * @Description:
 */
@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,readOnly=true)
public class AccountServiceImpl implements AccountService {

	private AccountDao ad;
	private TransactionTemplate tt;

	public AccountServiceImpl(AccountDao ad) {
		this.ad = ad;
	}

	@Override
	@Transactional(isolation=Isolation.REPEATABLE_READ,propagation=Propagation.REQUIRED,readOnly=false)
	public void transfer(Integer from, Integer to, Double money) {

		// 减钱
		ad.decreaseMoney(from, money);
		int i = 1/0;
		// 加钱
		ad.addMoney(to, money);

	}

	/*
	 * @Override public void transfer(Integer from, Integer to, Double money) {
	 * 
	 * tt.execute(new TransactionCallbackWithoutResult() { protected void
	 * doInTransactionWithoutResult(TransactionStatus arg0) { // 减钱
	 * ad.decreaseMoney(from, money); // 加钱 ad.addMoney(to, money); } });
	 * 
	 * }
	 */

	public void setAd(AccountDao ad) {
		this.ad = ad;
	}

	public void setTt(TransactionTemplate tt) {
		this.tt = tt;
	}

}
