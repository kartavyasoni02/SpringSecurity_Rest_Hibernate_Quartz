package com.fs.ks.service.role;

import java.util.List;

import com.fs.ks.model.Role;

public interface RoleService {

    public Integer addRole(Role role) throws Exception;

    public Role getRole(int id) throws Exception;
    
    public Role getRole(String rolename) throws Exception;

    public Integer updateRole(Role role) throws  Exception;

    public void deleteRole(int id) throws Exception;

    public List<Role> getRoles() throws Exception;

    public List<Role> getAlllRole(List<Integer> roleIds) throws Exception;

}
