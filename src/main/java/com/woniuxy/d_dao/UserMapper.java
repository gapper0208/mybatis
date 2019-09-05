package com.woniuxy.d_dao;

import java.util.List;

/*
 该接口必须：
 1. 名字必须与对应的UserMapper.xml名字一致（不带后缀）
 2. 接口中的方法，必须与UserMapper.xml中的语句的id一致
 3. 接口中的方法的参数、返回值类型，也必须与UserMapper.xml中的语句的parameterTyp和resultType一致
*/

public interface UserMapper {
	void save(User user);
	
	List<User> findAll();
	User findOne(Integer id);
}
