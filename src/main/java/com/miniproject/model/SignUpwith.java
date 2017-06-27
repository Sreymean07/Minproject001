package com.miniproject.model;

public class SignUpwith {

	private int id;
	private String deviceName;
	
	public SignUpwith() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public SignUpwith(int id, String deviceName) {
		super();
		this.id = id;
		this.deviceName = deviceName;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	
	
	
}
