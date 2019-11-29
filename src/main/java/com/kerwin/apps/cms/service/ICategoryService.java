package com.kerwin.apps.cms.service;

import com.kerwin.apps.cms.bean.Category;
import com.kerwin.apps.cms.config.MyException;

import java.util.List;

/**
 * @author kerwin
 * @title: ICategory
 * @projectName cms
 * @date 2019/11/14 - 14:58
 */
public interface ICategoryService {
    List<Category> findAll();
    Category findById(Long id);
    void saveOrUpdate(Category category) throws MyException;
    void deleteById(Long id) throws MyException;
    void batchDelete(Long[] ids) throws MyException;
}
