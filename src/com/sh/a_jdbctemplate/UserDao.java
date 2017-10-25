package com.sh.a_jdbctemplate;

import java.util.List;

import com.sh.bean.User;

/**
 * @author Amaze_lee
 * @date 2017年10月23日 上午10:27:15
 * @version V1.0
 * @Description:
 */
public interface UserDao {

	// 增
	void save(User u);

	// 删
	void delete(Integer id);

	// 改
	void update(User u);

	// 查
	User getById(Integer id);

	// 查
	int getTotalCount();

	// 查
	List<User> getAll();
}
