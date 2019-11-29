package com.kerwin.apps.cms.bean.extend;

import com.kerwin.apps.cms.bean.Role;
import com.kerwin.apps.cms.bean.User;

import java.util.List;

/**
 * @author kerwin
 * @title: UserExtend
 * @projectName cms
 * @date 2019/11/15 - 15:09
 */
//用户拓展类  管理用户所拥有的角色
public class UserExtend extends User {
    public static final String STATUS_NORMAL="正常";
    public static final String STATUS_FORBIDDEN="禁用";


    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
