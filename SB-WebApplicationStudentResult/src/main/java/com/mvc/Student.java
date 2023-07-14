package com.mvc;

import java.util.List;

public class Student {
	private int sid;
	private String fname;
	private String lname;
	private List<String> courses;
	private String gender;
	private long number;
	private String address;
	private int javaMarks;
	private int hibernateMarks;
	private int springBootMarks;
	public Student() {
		super();
	}
	public Student(int sid, String fname, String lname, List<String> courses, String gender, long number,
			String address, int javaMarks, int hibernateMarks, int springBootMarks) {
		super();
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
		this.courses = courses;
		this.gender = gender;
		this.number = number;
		this.address = address;
		this.javaMarks = javaMarks;
		this.hibernateMarks = hibernateMarks;
		this.springBootMarks = springBootMarks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getJavaMarks() {
		return javaMarks;
	}
	public void setJavaMarks(int javaMarks) {
		this.javaMarks = javaMarks;
	}
	public int getHibernateMarks() {
		return hibernateMarks;
	}
	public void setHibernateMarks(int hibernateMarks) {
		this.hibernateMarks = hibernateMarks;
	}
	public int getSpringBootMarks() {
		return springBootMarks;
	}
	public void setSpringBootMarks(int springBootMarks) {
		this.springBootMarks = springBootMarks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", fname=" + fname + ", lname=" + lname + ", courses=" + courses + ", gender="
				+ gender + ", number=" + number + ", address=" + address + ", javaMarks=" + javaMarks
				+ ", hibernateMarks=" + hibernateMarks + ", springBootMarks=" + springBootMarks + "]";
	}
	
}
