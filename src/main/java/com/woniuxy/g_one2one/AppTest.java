package com.woniuxy.g_one2one;

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
		
//		HusbandMapper mapper = s.getMapper(HusbandMapper.class);
//		Husband h = mapper.findOne(1);
//		System.out.println(h);
		
		WifeMapper mapper = s.getMapper(WifeMapper.class);
		Wife wife = mapper.findOne(1);
		System.out.println(wife);
		
		// ======================================================================
		s.close();
		
	}
	
	
}
