package com.kerwin.apps.cms.service.impl;

import com.kerwin.apps.cms.bean.User;
import com.kerwin.apps.cms.dao.UserMapper;
import com.kerwin.apps.cms.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author kerwin
 * @title: UserServiceImpl
 * @projectName cms
 * @date 2019/11/11 - 16:29
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        if (userMapper.selectByPrimaryKey(user.getId()) != null){
            userMapper.updateByPrimaryKey(user);
            System.out.println("修改用户成功！");
        }else {
            userMapper.insert(user);
            System.out.println("添加用户成功！");
        }
    }

    @Override
    public void deleteUser(Long id) {
        userMapper.deleteByPrimaryKey(id);
        System.out.println("删除成功");
    }

}
