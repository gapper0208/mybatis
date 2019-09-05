package com.woniuxy.e_conflict;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
	private Integer id2;
	private String name2;
	private Date birthday2;
	private Double money2;
}