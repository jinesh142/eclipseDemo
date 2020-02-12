package com.jina.eclipesgit.model;

import org.hibernate.annotations.Entity;

@Entity
public class Employee {

	private String employeeId;
	private String employeeName;
	private double employeeSal;
	private String employeeAddr;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSal() {
		return employeeSal;
	}
	public void setEmployeeSal(double employeeSal) {
		this.employeeSal = employeeSal;
	}
	public String getEmployeeAddr() {
		return employeeAddr;
	}
	public void setEmployeeAddr(String employeeAddr) {
		this.employeeAddr = employeeAddr;
	}
	
}
