package com.woniuxy.g_one2one;

import java.io.Serializable;

import lombok.Data;

@Data
public class Husband implements Serializable {
	private Integer hid;
	private String hname;
	private Wife wife;
}
