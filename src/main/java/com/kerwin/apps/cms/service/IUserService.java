package com.kerwin.apps.cms.service;

import com.kerwin.apps.cms.bean.User;

/**
 * @author kerwin
 * @title: IUserService
 * @projectName cms
 * @date 2019/11/11 - 16:27
 */
public interface IUserService {
    void addUser(User user);
    void deleteUser(Long id);
}
