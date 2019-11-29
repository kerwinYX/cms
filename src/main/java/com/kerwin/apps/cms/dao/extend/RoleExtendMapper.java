package com.kerwin.apps.cms.dao.extend;

import com.kerwin.apps.cms.bean.Role;
import com.kerwin.apps.cms.bean.extend.RoleExtend;

import java.util.List;

/**
 * @author kerwin
 * @title: RoleExtendMapper
 * @projectName cms
 * @date 2019/11/15 - 15:13
 */
public interface RoleExtendMapper {
    List<Role> selectByUserId(Long id);
    List<RoleExtend> selectAll();
}
