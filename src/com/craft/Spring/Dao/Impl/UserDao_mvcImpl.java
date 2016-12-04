package com.craft.Spring.Dao.Impl;


import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.craft.Spring.Dao.UserDao_mvc;
import com.craft.Spring.entity.User;

/**
 * springmvc 与mybits 整合学习测试
 * @author Administrator
 *
 */
@Repository
public class UserDao_mvcImpl implements UserDao_mvc{
	@Resource
	private SqlSessionFactory sqlSessionFactory;
	/*public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}*/

	public void insert(User user){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("insert_User", user);
		sqlSession.close();
	}
}
