package com.kerwin.apps.cms.web.controller;

import com.kerwin.apps.cms.bean.Article;
import com.kerwin.apps.cms.bean.extend.ArticleExtend;
import com.kerwin.apps.cms.service.IArticleService;
import com.kerwin.apps.cms.utils.Message;
import com.kerwin.apps.cms.utils.MessageUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author kerwin
 * @title: ArticleController
 * @projectName cms
 * @date 2019/11/12 - 10:23
 */
@RestController
@RequestMapping("/article")
@Validated
public class ArticleController {

    private final IArticleService iArticleService;

    @Autowired
    public ArticleController(IArticleService iArticleService) {
        this.iArticleService = iArticleService;
    }

    @ApiOperation(value = "查询所有文章", notes = "级联所属栏目和作者")
    @GetMapping("/findAll")
    public Message findAll() {
        List<ArticleExtend> list = iArticleService.findAll();
        return MessageUtil.success(list);
    }

    @ApiOperation("通过id查询")
    @ApiImplicitParams(

            //默认情况传来的参数是json格式
            @ApiImplicitParam(name = "id", value = "文章编号 主键", paramType = "query")
    )
    @GetMapping("findById")
    public Message findById(Long id) {
        ArticleExtend byId = iArticleService.findById(id);
        return MessageUtil.success(byId);
    }

    @ApiOperation(value = "保存或更新文章的信息", notes = "如果有id为更新  无id是插入")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "编号", paramType = "form"),
            @ApiImplicitParam(name = "title", value = "文章标题", paramType = "form", required = true),
            @ApiImplicitParam(name = "content", value = "内容", paramType = "form", required = true),
            @ApiImplicitParam(name = "categoryId", value = "栏目id", paramType = "form", required = true),
            @ApiImplicitParam(name = "authorId", value = "作者id", paramType = "form")
    }
    )
    @PostMapping("/saveOrUpdate")
    public Message saveOrUpdate(Long id,
                                @NotNull
                                String title,
                                @NotNull
                                String content,
                                @NotNull
                                Long categoryId,
                                Long authorId) {
        Article article = new ArticleExtend();
        article.setId(id);
        article.setTitle(title);
        article.setContent(content);
        article.setCategoryId(categoryId);
        article.setAuthorId(authorId);
        iArticleService.saveOrUpdate(article);

        return MessageUtil.success("更新成功！");
    }

}
