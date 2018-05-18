package com.yy.ch3.mapper;

import com.yy.ch3.pojo.Role;
import java.util.List;

public interface RoleMapper {
    int insertRole(Role role);
    int deleteRole(Long id);
    int updateRole(Role role);
    int getRole(Long id);
    List<Role> findRoles(String roleName);
}
