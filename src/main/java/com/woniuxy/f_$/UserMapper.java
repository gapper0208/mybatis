package com.woniuxy.f_$;

import java.util.List;
import java.util.Map;

public interface UserMapper {
	List<User> find(Map map);
	List<User> find2(String name);
}
