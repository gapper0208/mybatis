package com.woniuxy.h_one2many;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Dept implements Serializable {
	private Integer did;
	private String dname;
	private List<Emp> emps;

}
