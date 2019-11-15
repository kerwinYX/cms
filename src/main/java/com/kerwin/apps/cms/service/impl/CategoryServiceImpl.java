package com.kerwin.apps.cms.service.impl;

import com.kerwin.apps.cms.bean.Category;
import com.kerwin.apps.cms.bean.CategoryExample;
import com.kerwin.apps.cms.config.MyException;
import com.kerwin.apps.cms.dao.CategoryMapper;
import com.kerwin.apps.cms.service.ICategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author kerwin
 * @title: CategoryImpl
 * @projectName cms
 * @date 2019/11/14 - 14:58
 */
@Service
public class CategoryServiceImpl implements ICategoryService {

    @Resource
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> findAll() {
        return categoryMapper.selectByExample(new CategoryExample());
    }

    @Override
    public void saveOrUpdate(Category category) {
        if (category.getId() != null){
            categoryMapper.updateByPrimaryKey(category);
        }else {
//            判断栏目名是否重名
            CategoryExample example = new CategoryExample();
            example.createCriteria().andNameEqualTo(category.getName());
            List<Category> categories = categoryMapper.selectByExample(example);
            if (categories.size()>0){
                throw new MyException("该栏目名已经存在");
            }
            categoryMapper.insert(category);
        }
    }

    @Override
    public void deleteById(Long id) throws MyException {
        //            判断栏目Id是否存在
        CategoryExample example = new CategoryExample();


        categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public void batchDelete(Long[] ids) throws MyException {
        for (Long id : ids) {
            this.deleteById(id);
        }

    }
}
