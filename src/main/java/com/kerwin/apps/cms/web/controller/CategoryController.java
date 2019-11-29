package com.kerwin.apps.cms.web.controller;

import com.kerwin.apps.cms.bean.Category;
import com.kerwin.apps.cms.service.ICategoryService;
import com.kerwin.apps.cms.utils.Message;
import com.kerwin.apps.cms.utils.MessageUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author kerwin
 * @title: CategoryController
 * @projectName cms
 * @date 2019/11/14 - 15:09
 */
@Validated
@RestController
@RequestMapping("/category")
public class CategoryController {
    private final ICategoryService iCategoryService;

    @Autowired
    public CategoryController(ICategoryService iCategoryService) {
        this.iCategoryService = iCategoryService;
    }

    @ApiOperation("查询所有栏目")
    @GetMapping("findAll")
    public Message findAll(){
        List<Category> all = iCategoryService.findAll();
        return MessageUtil.success(all);
    }

    @ApiOperation("通过父栏目id得到父栏目名字")
    @GetMapping("findById")
    public Message findById(Long id){
        Category byId = iCategoryService.findById(id);
        return MessageUtil.success(byId);
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

    @ApiOperation(value = "保存或更新文章的信息", notes = "如果有id为更新  无id是插入")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "栏目id", paramType = "form"),
            @ApiImplicitParam(name = "name", value = "栏目名", paramType = "form", required = true),
            @ApiImplicitParam(name = "description", value = "栏目描述", paramType = "form"),
            @ApiImplicitParam(name = "no", value = "栏目编号", paramType = "form"),
            @ApiImplicitParam(name = "parentId", value = "父栏目id", paramType = "form")
    }
    )
    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(Long id, @NotNull String name, String description, Long no, Long parentId){

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
