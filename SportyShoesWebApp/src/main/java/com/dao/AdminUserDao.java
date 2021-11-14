package com.dao;

import com.dto.AdminUser;

public interface AdminUserDao {
	
	public Boolean checkUserExist();
	public void addAdminUser(AdminUser adminUser);
	public void updateAdminUserPassword(AdminUser adminUser);
	public Boolean validateAdminUser(AdminUser adminUser);

}
