package com.dao;

import com.dto.User;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean validateUser(User user) {
		// TODO Auto-generated method stub
		
		boolean isUserValid=false;
		String uname = user.getUserName();
		String Password = user.getPassword();
		System.out.println(uname);
		System.out.println(Password);
		if(uname.equals("Soni") && Password.equals("pass"))
			isUserValid=true;
		return isUserValid;
	}

}
