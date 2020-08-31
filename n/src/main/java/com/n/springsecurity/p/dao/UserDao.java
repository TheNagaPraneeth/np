package com.n.springsecurity.p.dao;

import com.n.springsecurity.p.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);
    
}
