package com.woniuxy.b_parameter;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	private static SqlSessionFactory sf;
	
	static {
		InputStream in = AppTest.class.getResourceAsStream("mybatis-config.xml");
		sf = new SqlSessionFactoryBuilder().build(in);
	}
	
	public static SqlSession openSession() {
		return sf.openSession(true);
	}
}
