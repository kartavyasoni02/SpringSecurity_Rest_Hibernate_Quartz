package com.fs.ks.dao;

import java.util.List;

import com.fs.ks.model.Role;

public interface RoleDAO {

    public void addRole(Role role) throws Exception;

    public Role getRole(int id) throws Exception;

    public Role getRole(String roleName) throws Exception;

    public Integer updateRole(Role role) throws Exception;

    public void deleteRole(int id) throws Exception;

    public List<Role> getRoles() throws Exception;

	public List<Role> getAlllRole(List<Integer> roleIds) throws Exception;

	boolean checkRole(String usersRole, Integer id) throws Exception;

}
