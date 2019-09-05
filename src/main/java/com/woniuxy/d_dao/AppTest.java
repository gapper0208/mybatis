package com.woniuxy.d_dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class AppTest { 
	@Test
	public void testSave() throws Exception {
		SqlSession s = MybatisUtils.openSession(); 
		// ======================================================================
		
		User user = new User();
		user.setName("过桥米线");
		user.setBirthday(new Date());
		user.setMoney(10d);
		
		// 传入接口字节码，它还你一个代理对象，该代理对象直接实现了接口。
		UserMapper mapper = s.getMapper(UserMapper.class);
		
//		mapper.save(user);
		
//		List<User> list = mapper.findAll();
//		
//		for (User user2 : list) {
//			System.out.println(user2);
//		}
		
		User user2 = mapper.findOne(11);
		System.out.println(user2);
		
		System.out.println(mapper.getClass());
		
		// ======================================================================
		s.close();
		
	}
	
	
}
