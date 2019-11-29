package com.kerwin.apps.cms.service.impl;

import com.kerwin.apps.cms.bean.User;
import com.kerwin.apps.cms.bean.extend.UserExtend;
import com.kerwin.apps.cms.config.MyException;
import com.kerwin.apps.cms.dao.UserMapper;
import com.kerwin.apps.cms.service.IUserService;
import com.kerwin.apps.cms.vm.UserVM;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

//    登录
    @Override
    public User login(UserVM userVM) throws MyException {
        return null;
    }


//    通过所有
    @Override
    public List<User> findAll() {
        return null;
    }

//    级联查询所有
    @Override
    public List<UserExtend> cascadeRoleFindAll() {
        return null;
    }

//    保存或更新
    @Override
    public void saveOrUpdate(User User) throws MyException {

    }

//    更新状态
    @Override
    public void changeStatus(long id, String status) throws MyException {

    }

//    通过id删除
    @Override
    public void deleteById(long id) throws MyException {

    }

//    设置角色
    @Override
    public void setRoles(long id, List<Long> roles) {

    }

//    通过id查询
    @Override
    public UserExtend findById(Long id) {
        return (UserExtend) userMapper.selectByPrimaryKey(id);
    }
}
