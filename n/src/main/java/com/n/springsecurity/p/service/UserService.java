package com.n.springsecurity.p.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.n.springsecurity.p.entity.User;
import com.n.springsecurity.p.user.CrmUser;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(CrmUser crmUser);
}
