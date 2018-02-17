package com.tcs.onlineshop.helper;

import com.tcs.onlineshop.dao.UserDAO;
import com.tcs.onlineshop.dto.UserDTO;

public class UserHelper {
	UserDAO userDAO = new UserDAO();
	public String isAlreadyLogin(UserDTO userDTO) {
		if(userDAO.searchIsLogin(userDTO)) {
			return "User is Already Login";
		}
		else {
			boolean isFound = userDAO.searchAndUpdate(userDTO);
			if(isFound) {
			return "Welcome "+userDTO.getUserid();
			}
			else {
				return "Invalid Userid or Password";
			}
		}
	}
	
	public String isAlreadyRegister(UserDTO userDTO) {
		String message = "";
		if(userDAO.search(userDTO)) {
			message = "User is Already Registered";
		}
		else {
			userDAO.add(userDTO);
			message = "User Register SuccessFully...";
		}
		return message;
	}
}
