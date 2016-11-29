package com.craft.Spring.Service;


import org.springframework.stereotype.Service;

import com.craft.Spring.Dao.UserDao_mvc;
import com.craft.Spring.entity.User;

/**
 * service user 测试业务实现层
 * @author Administrator
 *
 */

public class UserService{
	
	private UserDao_mvc userDao;
	public void setUserDao(UserDao_mvc userDao) {
		this.userDao = userDao;
	}
	/**
	 *    添加用户
	 */     public void UserAdd(User user) throws Exception{
    	userDao.insert(user);
    }
}

