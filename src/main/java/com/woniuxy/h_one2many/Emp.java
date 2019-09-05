package com.woniuxy.h_one2many;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Emp implements Serializable {
	private Integer eid;
	private String ename;
	private Date hiredate;
	private Double sal;
	private Dept dept;

}
