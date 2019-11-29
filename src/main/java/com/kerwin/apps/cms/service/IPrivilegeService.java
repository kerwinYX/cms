package com.kerwin.apps.cms.service;

import com.kerwin.apps.cms.bean.Privilege;
import com.kerwin.apps.cms.bean.extend.PrivilegeTree;
import com.kerwin.apps.cms.config.MyException;

import java.util.List;

/**
 * @author kerwin
 * @title: IPrivilegeService
 * @projectName cms
 * @date 2019/11/18 - 19:50
 */
public interface IPrivilegeService {

//    查询所有权限
    List<Privilege> findAll();

//    通过parentId查询权限
    List<Privilege> findByParentId(Long parentId);

//    保存或更新权限
    void saveOrUpdate(Privilege privilege) throws MyException;

//    权限树
    List<PrivilegeTree> findPrivilegeTree();

//    查询用户所有权限
    List<Privilege> findByUserId(long id);


}
