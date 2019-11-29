package com.kerwin.apps.cms.service.impl;

import com.kerwin.apps.cms.bean.Role;
import com.kerwin.apps.cms.bean.RoleExample;
import com.kerwin.apps.cms.bean.Role_Privilege;
import com.kerwin.apps.cms.bean.Role_PrivilegeExample;
import com.kerwin.apps.cms.bean.extend.RoleExtend;
import com.kerwin.apps.cms.config.MyException;
import com.kerwin.apps.cms.dao.RoleMapper;
import com.kerwin.apps.cms.dao.Role_PrivilegeMapper;
import com.kerwin.apps.cms.dao.extend.RoleExtendMapper;
import com.kerwin.apps.cms.service.IRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author kerwin
 * @title: RoleServiceImpl
 * @projectName cms
 * @date 2019/11/18 - 19:47
 */
@Service
public class RoleServiceImpl implements IRoleService {
    @Resource
    private RoleMapper RoleMapper;
    @Resource
    private RoleExtendMapper RoleExtendMapper;
    @Resource
    private Role_PrivilegeMapper RolePrivilegeMapper;


    //    授权
    @Override
    public void authorization(long roleId, List<Long> privilegeIds) {
        // 根据roleid查询出所有的权限
        Role_PrivilegeExample example = new Role_PrivilegeExample();
        example.createCriteria().andRole_idEqualTo(roleId);
        List<Role_Privilege> list = RolePrivilegeMapper.selectByExample(example);
        // 将list转换为privilegeIDs的集合
        List<Long> old_privilegeIds = new ArrayList<>();
        for(Role_Privilege rp : list){
            old_privilegeIds.add(rp.getPrivilege_id());
        }
        // 依次判断privilegeIds 是否存在old_privilegeIds，如果不在则插入
        for(long privilegeId : privilegeIds){
            if (!old_privilegeIds.contains(privilegeId)) {
                Role_Privilege rp = new Role_Privilege();
                rp.setRole_id(roleId);
                rp.setPrivilege_id(privilegeId);
                RolePrivilegeMapper.insert(rp);
            }
        }
        // 依次判断 是否存在old_privilegeIds 是否存在privilegeIds，如果不存在删除
        for(long privilegeId: old_privilegeIds){
            if(!privilegeIds.contains(privilegeId)){
                // 根据privilegeId 从桥表中删除
                example.clear();
                example.createCriteria()
                        .andRole_idEqualTo(roleId)
                        .andPrivilege_idEqualTo(privilegeId);
                RolePrivilegeMapper.deleteByExample(example);
            }
        }


    }

    //  查询所有角色
    @Override
    public List<Role> findAll() {
        return RoleMapper.selectByExample(new RoleExample());
    }

    //  查询角色级联权限
    @Override
    public List<RoleExtend> cascadePrivilegeFindAll() {
        return RoleExtendMapper.selectAll();
    }

    //    保存或更新角色信息
    @Override
    public void saveOrUpdate(Role Role) throws MyException {

    }

    //   通过id删除角色信息
    @Override
    public void deleteById(long id) throws MyException {

    }
}
