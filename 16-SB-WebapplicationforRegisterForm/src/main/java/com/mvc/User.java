package com.mvc;

import java.util.List;

public class User {
	private String name;
	private String email;
	private String genders;
	private String password;
	private List<String> batches;
	private List<String> courses;
	public User() {
		super();
	}
	public User(String name, String email, String genders, String password, List<String> batches,
			List<String> courses) {
		super();
		this.name = name;
		this.email = email;
		this.genders = genders;
		this.password = password;
		this.batches = batches;
		this.courses = courses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGenders() {
		return genders;
	}
	public void setGenders(String genders) {
		this.genders = genders;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<String> getBatches() {
		return batches;
	}
	public void setBatches(List<String> batches) {
		this.batches = batches;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", genders=" + genders + ", password=" + password
				+ ", batches=" + batches + ", courses=" + courses + "]";
	}
	
	
}
