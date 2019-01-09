package com.app.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class Student {
	
	@NotEmpty(message="plz name not shoud be empty")
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@NotEmpty(message="plz address not shoud be empty")
	private String address;
	@NotEmpty(message="plz email shoud not empty")
	@Email(message="plz email shoud be well format")
	private String email;

}
