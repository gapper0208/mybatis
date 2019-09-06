package com.woniuxy.k_cache;

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