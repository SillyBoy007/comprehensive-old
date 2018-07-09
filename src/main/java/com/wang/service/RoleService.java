package com.wang.service;

import com.wang.entity.Role;
import com.wang.entity.UserRole;
import com.wang.entity.vo.PageVo;
import com.wang.entity.vo.RetResult;

import java.util.List;

public interface RoleService {
    List<UserRole> getUserRolePageList(PageVo pageVo);
    Role getRoleById(String id);
    int countUserRole();
    RetResult setManage(String id);
    RetResult unSetManage(String id);
}
