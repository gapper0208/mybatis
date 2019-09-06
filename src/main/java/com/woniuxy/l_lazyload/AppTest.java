package com.woniuxy.l_lazyload;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class AppTest { 
	@Test
	public void test() throws Exception {
		SqlSession s = MybatisUtils.openSession(); 
		// ======================================================================
		DeptMapper mapper = s.getMapper(DeptMapper.class);
		
		Dept dept = mapper.findOne(1);
		
		System.out.println(dept.getDname());
		
		Thread.sleep(3000);
		
		System.out.println(dept.getEmps());
		
		
		// ======================================================================
		s.close();
		
	}
	
	
}
