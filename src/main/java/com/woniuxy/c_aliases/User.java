package com.woniuxy.c_aliases;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
	private Integer id;
	private String name;
	private Date birthday;
	private Double money;
}