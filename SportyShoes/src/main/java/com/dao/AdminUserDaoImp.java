package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

//import javax.sql.DataSource;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.dto.AdminUser;

@Component(value="AdminUserDaoImp")
public class AdminUserDaoImp implements AdminUserDao {
		
	//@Autowired
	//private DataSource datasource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addAdminUser(AdminUser adminUser) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		System.out.println(adminUser.getUsername());
		
		String sql= "insert into admin_users values (?,?)";
		int i = jdbcTemplate.update(sql, new Object[] {
				adminUser.getUsername(),adminUser.getPassword()
		});
		
		if (i>0)
			System.out.println("update successfull");
		else
			System.out.println("update failed");
		
	}

	

}
