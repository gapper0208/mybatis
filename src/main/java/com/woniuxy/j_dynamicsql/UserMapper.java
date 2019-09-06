package com.woniuxy.j_dynamicsql;

import java.util.List;

public interface UserMapper {
	List<User> find(UserExample ue);
	List<User> find2(UserExample ue);
	List<User> find3(UserExample ue);
	List<User> find4(UserExample ue);
	void update(User user);
}
