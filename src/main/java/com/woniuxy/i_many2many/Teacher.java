package com.woniuxy.i_many2many;

import java.util.Set;

import lombok.Data;

@Data
public class Teacher {
	private Integer tid;
	private String tname;
	private Set<Student> students;
}
