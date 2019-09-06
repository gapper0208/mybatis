package com.woniuxy.j_dynamicsql;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class AppTest { 
	@Test
	public void testFind() throws Exception {
		SqlSession s = MybatisUtils.openSession(); 
		// ======================================================================
		
		UserMapper mapper = s.getMapper(UserMapper.class);
		
		UserExample ue = new UserExample();
		
		ue.setId(6);
//		ue.setName("עשענְֿ");
//		ue.setMinId(3);
//		ue.setMaxId(6);
//		ue.setIds(Arrays.asList(1,3,5));
		
		List<User> list = mapper.find(ue);
		
		for (User user : list) {
			System.out.println(user);
			
		}
		
		// ======================================================================
		s.close();
		
	}
	
	@Test
	public void testUpdate() throws Exception {
		SqlSession s = MybatisUtils.openSession(); 
		// ======================================================================
		UserMapper mapper = s.getMapper(UserMapper.class);
		
		User user = new User();
		user.setId(14);
		user.setName("qqq");
		user.setBirthday(new Date());
		user.setMoney(999d);
		
		mapper.update(user);
		// ======================================================================
		s.close();
	}
	
	
}
