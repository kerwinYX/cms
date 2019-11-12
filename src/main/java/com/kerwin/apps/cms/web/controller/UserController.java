package com.kerwin.apps.cms.web.controller;

import com.kerwin.apps.cms.bean.User;
import com.kerwin.apps.cms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author kerwin
 * @title: UserController
 * @projectName cms
 * @date 2019/11/11 - 16:33
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final IUserService iUserService;

    @Autowired
    public UserController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @PostMapping("/register")
    public String addUser(@RequestBody User user){
        iUserService.addUser(user);
        return "200";
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        iUserService.deleteUser(id);

    }
}
