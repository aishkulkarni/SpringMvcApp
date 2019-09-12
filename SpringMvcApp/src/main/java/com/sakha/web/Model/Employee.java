package com.sakha.web.Model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Employee {
	
	int empid;
	String empname;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	LocalDate dob;
	float salary;
	
	
	
	
	public Employee(int empid, String empname, LocalDate dob, float salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.dob = dob;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", dob=" + dob + "]";
	}
	
	
	
	
	

}
