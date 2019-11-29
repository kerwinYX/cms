package com.kerwin.apps.cms.service;

import com.kerwin.apps.cms.bean.User;
import com.kerwin.apps.cms.bean.extend.UserExtend;
import com.kerwin.apps.cms.config.MyException;
import com.kerwin.apps.cms.vm.UserVM;

import java.util.List;

/**
 * @author kerwin
 * @title: IUserService
 * @projectName cms
 * @date 2019/11/11 - 16:27
 */
public interface IUserService {

    /**
     * @Description: 登录
     */
    User login(UserVM userVM) throws MyException;

    /**
     * @Description: 通过id查询
     */
    UserExtend findById(Long id);

    /**
     * @Description: 查询所有
     */
    List<User> findAll();

    /**
     * @Description: 级联查询所有
     */
    List<UserExtend> cascadeRoleFindAll();

    /**
     * @Description:  保存或更新
     */
    void saveOrUpdate(User User) throws MyException;

    /**
     * @Description: 更新状态
     */
    void changeStatus(long id,String status) throws MyException;

    /**
     * 通过id删除
     */
    void deleteById(long id) throws MyException;

    /**
     * 设置角色
     */
    void setRoles(long id, List<Long> roles);
}
