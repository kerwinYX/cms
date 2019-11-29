package com.kerwin.apps.cms.dao.extend;

import com.kerwin.apps.cms.bean.Privilege;
import com.kerwin.apps.cms.bean.extend.PrivilegeTree;

import java.util.List;

/**
 * @author kerwin
 * @title: PrivilegeExtendMapper
 * @projectName cms
 * @date 2019/11/18 - 19:43
 */
public interface PrivilegeExtendMapper {
    List<PrivilegeTree> selectAll();

    List<Privilege> selectByParentId(long id);

    List<Privilege> selectByRoleId(long id);

    List<Privilege> selectByUserId(long id);
}
