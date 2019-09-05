package com.woniuxy.g_one2one;

import java.io.Serializable;

import lombok.Data;

@Data
public class Wife implements Serializable {
	private Integer wid;
	private String wname;
	private Husband husband;
}
