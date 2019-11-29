package com.kerwin.apps.cms.web.controller;

import com.kerwin.apps.cms.bean.User;
import com.kerwin.apps.cms.bean.extend.UserExtend;
import com.kerwin.apps.cms.service.IUserService;
import com.kerwin.apps.cms.utils.JwtTokenUtil;
import com.kerwin.apps.cms.utils.Message;
import com.kerwin.apps.cms.utils.MessageUtil;
import com.kerwin.apps.cms.vm.UserVM;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kerwin
 * @title: LoginController
 * @projectName cms
 * @date 2019/11/15 - 14:40
 */
@Validated
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @PostMapping("login")
    public Message login(@RequestBody UserVM userVM){
        // 1. 认证用户的用户名和密码
        User user = iUserService.login(userVM);
        // 2. 如果登录成功产生token,将token缓存起来，返回
        String token = JwtTokenUtil.createJWT(user.getId(), user.getUsername());
        // 3. 如果登录失败
        Map<String,String> map = new HashMap<>();
        map.put("token",token);
        return MessageUtil.success(map);
    }

    @ApiOperation(value = "通过token获取用户的基本信息")
    @GetMapping("info")
    public Message info(String token){
        // 1. 通过token获取用户信息  {id,use,gender,roles:[]}
        long id = Long.parseLong(JwtTokenUtil.getUserId(token,JwtTokenUtil.base64Secret));
        UserExtend baseUserExtend = iUserService.findById(id);
        return MessageUtil.success(baseUserExtend);
    }

    @PostMapping("logout")
    public Message logout(){
        // 1. 登录， token从缓存中移除掉
        return MessageUtil.success("退出成功");
    }


}
