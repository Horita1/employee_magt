package com.example.demo.entity;

import java.util.Date;

import lombok.Data;

/**
 * ユーザー情報　Entity
 */
@Data
public class User {
	
	private Long id;
	private String name;
	private String address;
	private String phone;
	private Date updateDate;
	private Date createDate;
	private Date deleteDate;

}
