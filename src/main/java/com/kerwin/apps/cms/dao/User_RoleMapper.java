package com.kerwin.apps.cms.dao;

import com.kerwin.apps.cms.bean.User_Role;
import com.kerwin.apps.cms.bean.User_RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface User_RoleMapper {
    long countByExample(User_RoleExample example);

    int deleteByExample(User_RoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User_Role record);

    int insertSelective(User_Role record);

    List<User_Role> selectByExample(User_RoleExample example);

    User_Role selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User_Role record, @Param("example") User_RoleExample example);

    int updateByExample(@Param("record") User_Role record, @Param("example") User_RoleExample example);

    int updateByPrimaryKeySelective(User_Role record);

    int updateByPrimaryKey(User_Role record);
}