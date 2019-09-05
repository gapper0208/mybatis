package com.woniuxy.a_hello;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class AppTest {
	@Test
	public void testSave() throws Exception {
		
		// 加载主配置
		InputStream in = AppTest.class.getResourceAsStream("mybatis-config.xml");
		// 创建工厂
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		// 从工厂中获取出会话，每一个会话都封装了一个Connection。
		// 获取会话的时候，事务就自动开启了，不用写任何api！
		SqlSession s = sf.openSession(true); 
		// ======================================================================
		
		User user = new User();
		user.setName("山东杂粮煎饼");
		user.setBirthday(new Date());
		user.setMoney(999d);
		
		s.insert("com.woniuxy.a_hello.UserMapper.save",user);
		
		// ======================================================================
		// 提交事务
		// s.commit();
		// 关闭会话
		s.close();
		
	}
	
	
	@Test
	public void testUpdate() throws Exception {
		InputStream in = AppTest.class.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		SqlSession s = sf.openSession();
		// ======================================================================
		
		User user = new User();
		user.setId(1);
		user.setName("咖啡");
		user.setBirthday(new Date());
		user.setMoney(666d);
		
		s.update("com.woniuxy.a_hello.UserMapper.update", user);
		
		// ======================================================================
		s.commit();
		s.close();
		
	}
	
	
	@Test
	public void testDelete() throws Exception {
		InputStream in = AppTest.class.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		SqlSession s = sf.openSession();
		// ======================================================================
		
		s.delete("com.woniuxy.a_hello.UserMapper.delete", 1);
		
		// ======================================================================
		s.commit();
		s.close();
		
	}
	
	@Test
	public void testFindAll() throws Exception {
		InputStream in = AppTest.class.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		SqlSession s = sf.openSession();
		// ======================================================================
		
		List<User> list = s.selectList("com.woniuxy.a_hello.UserMapper.findAll");
		
		for (User user : list) {
			System.out.println(user);
		}
		
		// ======================================================================
		s.commit();
		s.close();
		
	}
	
	
	@Test
	public void testFindOne() throws Exception {
		InputStream in = AppTest.class.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		SqlSession s = sf.openSession();
		// ======================================================================
		
		User user = s.selectOne("com.woniuxy.a_hello.UserMapper.findOne",2);
		System.out.println(user);
		
//		List<User> list = s.selectList("com.woniuxy.a_hello.UserMapper.findOne",2);
//		System.out.println(list);
		
		// ======================================================================
		s.commit();
		s.close();
		
	}
}
