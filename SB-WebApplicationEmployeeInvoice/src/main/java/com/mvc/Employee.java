package com.mvc;

public class Employee {
	private int empid;
	private String empName;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(int empid, String empName, double salary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
}
