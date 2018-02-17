package com.tcs.onlineshop.views;

import java.util.Scanner;

import com.tcs.onlineshop.dto.UserDTO;
import com.tcs.onlineshop.helper.UserHelper;
import com.tcs.onlineshop.util.Util;

public class UserView {
	UserHelper userHelper = new UserHelper();
	public void login() {
		Scanner scanner = Util.getScanner();
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String pwd = scanner.next();
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(pwd);
		String message = userHelper.isAlreadyLogin(userDTO);
		System.out.println(message);
	}
	
	public void register() {
		Scanner scanner = Util.getScanner();
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String pwd = scanner.next();
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(pwd);
		
		String message = userHelper.isAlreadyRegister(userDTO);
		System.out.println(message);
	}
	
	public static void main(String[] args) {
		
		UserView userView = new UserView();
		userView.register();
		userView.register();
		userView.login();
		userView.login();
	}

}
