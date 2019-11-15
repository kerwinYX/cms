package com.kerwin.apps.cms.dao;

import com.kerwin.apps.cms.bean.Role_Privilege;
import com.kerwin.apps.cms.bean.Role_PrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Role_PrivilegeMapper {
    long countByExample(Role_PrivilegeExample example);

    int deleteByExample(Role_PrivilegeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Role_Privilege record);

    int insertSelective(Role_Privilege record);

    List<Role_Privilege> selectByExample(Role_PrivilegeExample example);

    Role_Privilege selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Role_Privilege record, @Param("example") Role_PrivilegeExample example);

    int updateByExample(@Param("record") Role_Privilege record, @Param("example") Role_PrivilegeExample example);

    int updateByPrimaryKeySelective(Role_Privilege record);

    int updateByPrimaryKey(Role_Privilege record);
}