package org.leorodriguez.springsecurityexample1.service;

import org.leorodriguez.springsecurityexample1.controller.UserDTO;
import org.leorodriguez.springsecurityexample1.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public UserDetails loadUserByUsername(String userName);
    public void create(UserDTO userDTO);
    public User findUserByEmail(String email);
    public User findUserByName(String name);

}