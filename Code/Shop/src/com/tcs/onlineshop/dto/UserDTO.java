package com.tcs.onlineshop.dto;

public class UserDTO {
	private String userid;
	private String password;
	private boolean login;
	
	public boolean isLogin() {
		return login;
	}
	public void setLogin(boolean login) {
		this.login = login;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
