package com.woniuxy.f_$;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class AppTest { 
	@Test
	public void testSave() throws Exception {
		SqlSession s = MybatisUtils.openSession(); 
		// ======================================================================
		
		
		UserMapper mapper = s.getMapper(UserMapper.class);
		
//		Map map = new HashMap();
//		map.put("col", "money");
//		List<User> list = mapper.find(map);
//		for (User user : list) {
//			System.out.println(user);
//		}
		
		
		List<User> list = mapper.find2("1' or 1=1 or '1");
		for (User user : list) {
			System.out.println(user);
		}
		
		
		// ======================================================================
		s.close();
		
	}
	
	
}
