package com.craft.Spring.Dao;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.craft.Spring.entity.User;

/**
 * springmvc 与mybits 整合学习测试
 * @author Administrator
 *
 */

public class UserDao_mvc {
	private SqlSessionFactory sqlSessionFactory;
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public void insert(User user){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("insert_User", user);
		sqlSession.close();
	}
}
