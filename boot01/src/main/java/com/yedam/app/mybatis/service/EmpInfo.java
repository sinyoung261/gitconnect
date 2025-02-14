package com.yedam.app.mybatis.service;

import java.util.Date;

import lombok.Data;

//값을 담는 객체 : VO클래스
@Data
public class EmpInfo {
//	  private int employee_id;
//    private String last_name;
//    private Date hire_date;
//    private double salary;
	
	private int employeeid;
	private String lastName;
	private Date hireDate;
	private double salary;
}
