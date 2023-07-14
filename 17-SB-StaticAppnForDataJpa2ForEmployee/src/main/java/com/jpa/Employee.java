package com.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
		@Id
		@Column(name="id")
		private int empid;
		@Column(name="name")
		private String empName;
		@Column(name="password")
		private String empPassword;
		@Column(name="email")
		private String empEmail;
		@Column(name="companyName")
		private String empCompanyName;
		@Column(name="desig")
		private String empDesignation;
		@Column(name="salary")
		private String empSalary;
		private long mobileNumber;
		public Employee() {
			super();
		}
		public Employee(int empid, String empName, String empPassword, String empEmail, String empCompanyName,
				String empDesignation, String empSalary, long mobileNumber) {
			super();
			this.empid = empid;
			this.empName = empName;
			this.empPassword = empPassword;
			this.empEmail = empEmail;
			this.empCompanyName = empCompanyName;
			this.empDesignation = empDesignation;
			this.empSalary = empSalary;
			this.mobileNumber = mobileNumber;
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
		public String getEmpPassword() {
			return empPassword;
		}
		public void setEmpPassword(String empPassword) {
			this.empPassword = empPassword;
		}
		public String getEmpEmail() {
			return empEmail;
		}
		public void setEmpEmail(String empEmail) {
			this.empEmail = empEmail;
		}
		public String getEmpCompanyName() {
			return empCompanyName;
		}
		public void setEmpCompanyName(String empCompanyName) {
			this.empCompanyName = empCompanyName;
		}
		public String getEmpDesignation() {
			return empDesignation;
		}
		public void setEmpDesignation(String empDesignation) {
			this.empDesignation = empDesignation;
		}
		public String getEmpSalary() {
			return empSalary;
		}
		public void setEmpSalary(String empSalary) {
			this.empSalary = empSalary;
		}
		public long getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(long mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", empName=" + empName + ", empPassword=" + empPassword + ", empEmail="
					+ empEmail + ", empCompanyName=" + empCompanyName + ", empDesignation=" + empDesignation
					+ ", empSalary=" + empSalary + ", mobileNumber=" + mobileNumber + "]";
		}
		
		
}
