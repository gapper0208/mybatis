package com.woniuxy.h_one2many;

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
		
//		DeptMapper mapper = s.getMapper(DeptMapper.class);
//		Dept dept = mapper.findOne(1);
//		System.out.println(dept);
		
		EmpMapper mapper = s.getMapper(EmpMapper.class);
		Emp emp = mapper.findOne(2);
		
		System.out.println(emp);
		
		
		// ======================================================================
		s.close();
		
	}
	
	
}
