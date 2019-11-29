package com.kerwin.apps.cms.bean.extend;

import com.kerwin.apps.cms.bean.Privilege;
import com.kerwin.apps.cms.bean.Role;

import java.util.List;

/**
 * @author kerwin
 * @title: RoleExtend
 * @projectName cms
 * @date 2019/11/18 - 17:29
 */
//角色拓展多个权限
public class RoleExtend extends Role {
    private List<Privilege> privileges;

    public List<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
    }
}
