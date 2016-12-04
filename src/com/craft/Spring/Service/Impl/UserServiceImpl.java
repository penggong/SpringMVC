package com.craft.Spring.Service.Impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.craft.Spring.Dao.UserDao_mvc;
import com.craft.Spring.Service.UserService;
import com.craft.Spring.entity.User;

/**
 * service user 测试业务实现层
 * @author Administrator
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao_mvc userDao;
	/*public void setUserDao(UserDao_mvc userDao) {
		this.userDao = userDao;
	}*/
	/**
	 *    添加用户
	 */     public void UserAdd2(User user) throws Exception{
    	userDao.insert(user);
    	int i= 1/0;
    	System.out.println(i);
    	user.setU_id(6);
    	userDao.insert(user);
    }
	@Override
	public void UserAdd(User user) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("useradd------mark");
	}
}

