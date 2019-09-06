package com.woniuxy.i_many2many;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class AppTest { 
	@Test
	public void test() throws Exception {
		SqlSession s = MybatisUtils.openSession(); 
		// ======================================================================
//		TeacherMapper mapper = s.getMapper(TeacherMapper.class);
//		Teacher t = mapper.findOne(1);
//		System.out.println(t);
		
		 StudentMapper mapper = s.getMapper(StudentMapper.class);
		 Student stu = mapper.findOne(1);
		 System.out.println(stu);
		
		// ======================================================================
		s.close();
	}
	
	
}
