package com.woniuxy.j_dynamicsql;

import java.util.List;

import lombok.Data;

// 用于封装条件的类

@Data
public class UserExample {
	private Integer id;
	private String name;
	private Integer minId,maxId;
	private List<Integer> ids;
}
