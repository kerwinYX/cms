package com.kerwin.apps.cms.web.controller;

import com.kerwin.apps.cms.bean.Test;
import com.kerwin.apps.cms.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author kerwin
 * @title: TestController
 * @projectName cms
 * @date 2019/11/11 - 11:35
 */

@RestController
@RequestMapping("/test")
public class TestController {

    private final ITestService iTestService;

    @Autowired
    public TestController(ITestService iTestService) {
        this.iTestService = iTestService;
    }

    @GetMapping("findAll1")
    public List<Test> findAll(){

        return iTestService.findAll();
    }

    @PostMapping("saveOrUpdate")
    public String saveOrUpdate(Test test){
        iTestService.saveOrUpdate(test);
        return "保存成功！";
    }
}
