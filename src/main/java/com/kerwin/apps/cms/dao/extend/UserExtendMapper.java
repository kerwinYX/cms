package com.kerwin.apps.cms.dao.extend;

import com.kerwin.apps.cms.bean.extend.UserExtend;

import java.util.List;

/**
 * @author kerwin
 * @title: UserExtendMapper
 * @projectName cms
 * @date 2019/11/15 - 15:10
 */
public interface UserExtendMapper {
    UserExtend selectById(Long id);
    List<UserExtend> selectAll();
}
