package com.woniuxy.i_many2many;

import java.util.Set;

import lombok.Data;

@Data
public class Student {
	private Integer sid;
	private String sname;
	private Set<Teacher> teachers;
}
