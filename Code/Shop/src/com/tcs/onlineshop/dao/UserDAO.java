package com.tcs.onlineshop.dao;

import com.tcs.onlineshop.dto.UserDTO;

// CRUD
public class UserDAO {
	UserDTO userArray[] = new UserDTO[50];
	private int index;
	public UserDAO() {
		index = 0;
	}
	
	public boolean searchIsLogin(UserDTO userDTO) {
		if(userArray.length>0) {
			for(UserDTO userObject : userArray) {
				
				if(userObject!=null && 
						userObject.getUserid()
						.equals(userDTO.getUserid()) &&
						userObject.isLogin()) {
					
					return true;
				}
			}
			}
			return false;
	}
	
	public boolean searchAndUpdate(UserDTO userDTO) {
		if(userArray.length>0) {
			for(UserDTO userObject : userArray) {
				
				if(userObject!=null && 
						userObject.getUserid()
						.equals(userDTO.getUserid()) &&
						userObject.getPassword()
						.equals(userDTO.getPassword())) {
					userObject.setLogin(true);
					return true;
				}
			}
			}
			return false;
	}
	
	public boolean search(UserDTO userDTO) {
		if(userArray.length>0) {
		for(UserDTO userObject : userArray) {
			
			if(userObject!=null && userObject.getUserid().equals(userDTO.getUserid())) {
				return true;
			}
		}
		}
		return false;
	}
	
	public boolean add(UserDTO userDTO) {
		if(index>=50) {
			return false;
		}
		userArray[index] = userDTO;
		index++;
		return true;
	}

}
