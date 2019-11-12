package com.kerwin.apps.cms.service;

import com.kerwin.apps.cms.bean.Test;

import java.util.List;

/**
 * @author kerwin
 * @title: ITestService
 * @projectName cms
 * @date 2019/11/11 - 12:21
 */
public interface ITestService {

    void  saveOrUpdate(Test test);

    List<Test> findAll();
}
