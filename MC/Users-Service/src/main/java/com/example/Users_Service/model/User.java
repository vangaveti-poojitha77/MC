package com.example.Users_Service.model;
import jakarta.persistence.*;
// THIS IS NEWWWW
@Entity
@Table(name="user")
public class User{
	@Id
	@Column(name="userid")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String Address;
	@Column(name="password")
	private String password;
	
	public User() {
		
	}
	public int getUserId() {
		return userId;
	}
	public User(int userId, String name, String address, String password) {
		super();
		this.userId = userId;
		this.name = name;
		Address = address;
		
		this.password = password;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

