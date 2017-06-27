package com.miniproject.model;

public class Users {

	private int id;
	private String username;
	private String email;
	private String password;
	private String gender;
	private String userHash;
	private SignUpwith signUpwith;
	
	public Users() {
		// TODO Auto-generated constructor stub
	}
	
	public Users(int id, String username, String email, String password, String gender, String userHash,
			SignUpwith signUpWith) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.userHash = userHash;
		this.signUpwith = signUpWith;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUserHash() {
		return userHash;
	}
	public void setUserHash(String userHash) {
		this.userHash = userHash;
	}

	public SignUpwith getSignUpWith() {
		return signUpwith;
	}
	public void setSignUpwith(SignUpwith signUpWith) {
		this.signUpwith = signUpWith;
	}
	
}
