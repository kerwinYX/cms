package com.kerwin.apps.cms.dao;

import com.kerwin.apps.cms.bean.Privilege;
import com.kerwin.apps.cms.bean.PrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrivilegeMapper {
    long countByExample(PrivilegeExample example);

    int deleteByExample(PrivilegeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Privilege record);

    int insertSelective(Privilege record);

    List<Privilege> selectByExampleWithBLOBs(PrivilegeExample example);

    List<Privilege> selectByExample(PrivilegeExample example);

    Privilege selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Privilege record, @Param("example") PrivilegeExample example);

    int updateByExampleWithBLOBs(@Param("record") Privilege record, @Param("example") PrivilegeExample example);

    int updateByExample(@Param("record") Privilege record, @Param("example") PrivilegeExample example);

    int updateByPrimaryKeySelective(Privilege record);

    int updateByPrimaryKeyWithBLOBs(Privilege record);

    int updateByPrimaryKey(Privilege record);
}