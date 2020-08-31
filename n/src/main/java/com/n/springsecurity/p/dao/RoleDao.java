package com.n.springsecurity.p.dao;

import com.n.springsecurity.p.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
