package org.leorodriguez.springsecurityexample1.service;

import org.leorodriguez.springsecurityexample1.model.Role;

import java.util.List;


public interface RoleService {
    public void saveRole(Role role);
    public Role findRoleByRoleName(String name);
    public List<Role> getAllRoles();
    public List<Role> getRolesByUser(long id);

}