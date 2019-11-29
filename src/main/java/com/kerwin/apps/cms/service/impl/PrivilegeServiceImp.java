package com.kerwin.apps.cms.service.impl;

import com.kerwin.apps.cms.bean.Privilege;
import com.kerwin.apps.cms.bean.extend.PrivilegeTree;
import com.kerwin.apps.cms.config.MyException;
import com.kerwin.apps.cms.service.IPrivilegeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kerwin
 * @title: PrivilegeServiceImp
 * @projectName cms
 * @date 2019/11/18 - 19:58
 */
@Service
public class PrivilegeServiceImp implements IPrivilegeService {

    //    查询所有权限
    @Override
    public List<Privilege> findAll() {
        return null;
    }


//   查询用户所有权限
    @Override
    public List<Privilege> findByUserId(long id) {
        return null;
    }

    //    通过parentId查询权限
    @Override
    public List<Privilege> findByParentId(Long parentId) {
        return null;
    }

    //    保存或更新权限
    @Override
    public void saveOrUpdate(Privilege privilege) throws MyException {

    }

    //    权限树
    @Override
    public List<PrivilegeTree> findPrivilegeTree() {
        return null;
    }
}
