package com.kerwin.apps.cms.web.controller;

import com.kerwin.apps.cms.bean.Category;
import com.kerwin.apps.cms.service.ICategoryService;
import com.kerwin.apps.cms.utils.Message;
import com.kerwin.apps.cms.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author kerwin
 * @title: CategoryController
 * @projectName cms
 * @date 2019/11/14 - 15:09
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;

    @ApiOperation("查询所有栏目")
    @GetMapping("findAll")
    public Message findAll(){
        List<Category> all = iCategoryService.findAll();
        return MessageUtil.success(all);
    }


    @DeleteMapping
    public Message deleteById(Long id){
        iCategoryService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

    @DeleteMapping("batchDelete")
    public Message batchDelete(Long[] ids){
        iCategoryService.batchDelete(ids);
        return MessageUtil.success("删除成功！");
    }

    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(Long id,String name,String description,Long no,Long parentId){

        Category category = new Category();
        category.setId(id);
        category.setName(name);
        category.setDescription(description);
        category.setNo(no);
        category.setParent_id(parentId);
        iCategoryService.saveOrUpdate(category);

        return MessageUtil.success("更新成功！");
    }

}
