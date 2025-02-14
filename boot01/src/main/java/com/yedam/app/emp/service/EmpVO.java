package com.yedam.app.emp.service;

import java.util.Date;

import lombok.Data;

@Data
public class EmpVO {
	//employee_id => employeeId
	private Integer employeeId; //사원번호 [사용은 하는데 값이 넘어오지 않을 때 : Integer 사용]
	private String firstName; //이름
	private String lastName; //성
	private String email; //이메일
	private String phoneNumber; //연락처
	private Date hireDate; //입사일
	private String jobId; //업무
	private double Salary; //급여
	private double commissionPct; //커미션
	private int managerId; //상사번호 [그외 : int 사용]
	private int DepartmentId; //부서번호
	
}
