package com.woniuxy.e_conflict;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class AppTest { 
	@Test
	public void testSave() throws Exception {
		SqlSession s = MybatisUtils.openSession(); 
		// ======================================================================
		
		UserMapper mapper = s.getMapper(UserMapper.class);
		
		List<User> list = mapper.findAll2();
		
		for (User user : list) {
			System.out.println(user);
			
		}
		
		// ======================================================================
		s.close();
		
	}
	
	
}
