package com.pooldeal.domain;


public class Registration {

	private String id;

	private String email;
	private String password;
	private String name;
	private String location;
	private Integer phNumber;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(Integer phNumber) {
		this.phNumber = phNumber;
	}

}
