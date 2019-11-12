package com.kerwin.apps.cms.service.impl;

import com.kerwin.apps.cms.bean.Test;
import com.kerwin.apps.cms.bean.TestExample;
import com.kerwin.apps.cms.dao.TestMapper;
import com.kerwin.apps.cms.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author kerwin
 * @title: TestServiceImpl
 * @projectName cms
 * @date 2019/11/11 - 12:23
 */

@Service
public class TestServiceImpl implements ITestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public void saveOrUpdate(Test test) {
        if (test.getId() != null){
            testMapper.updateByPrimaryKey(test);
        }else {
            testMapper.insert(test);
        }

    }

    @Override
    public List<Test> findAll() {
        TestExample example = new TestExample();
        return testMapper.selectByExample(example);
    }
}
