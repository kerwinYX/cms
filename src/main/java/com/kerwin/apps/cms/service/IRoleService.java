package com.kerwin.apps.cms.service;

import com.kerwin.apps.cms.bean.Role;
import com.kerwin.apps.cms.bean.extend.RoleExtend;
import com.kerwin.apps.cms.config.MyException;

import java.util.List;

/**
 * @author kerwin
 * @title: IRoleService
 * @projectName cms
 * @date 2019/11/18 - 19:45
 */
public interface IRoleService {

//    授权
    void authorization(long roleId, List<Long> privilegeIds);


//  查询所有角色
    List<Role> findAll();

//  查询角色级联权限
    List<RoleExtend> cascadePrivilegeFindAll();

//    保存或更新角色信息
    void saveOrUpdate(Role baseRole) throws MyException;

//   通过id删除角色信息
    void deleteById(long id) throws MyException;
}
