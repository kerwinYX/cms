package com.kerwin.apps.cms.bean.extend;

import com.kerwin.apps.cms.bean.Privilege;

import java.util.List;

/**
 * @author kerwin
 * @title: PrivilegeTree
 * @projectName cms
 * @date 2019/11/18 - 17:26
 */

//权限树
public class PrivilegeTree extends Privilege {
    private List<Privilege> children;

    public List<Privilege> getChildren() {
        return children;
    }

    public void setChildren(List<Privilege> children) {
        this.children = children;
    }
}
