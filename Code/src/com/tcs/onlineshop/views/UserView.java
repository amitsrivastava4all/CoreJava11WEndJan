package com.tcs.onlineshop.views;

import java.util.Scanner;

import com.tcs.onlineshop.dto.UserDTO;
import com.tcs.onlineshop.util.Util;

public class UserView {
	
	public void login() {
		Scanner scanner = Util.getScanner();
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String pwd = scanner.next();
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(pwd);
	}
	
	public void register() {
		
	}

}
