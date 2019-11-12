package com.kerwin.apps.cms.web.controller;

import com.kerwin.apps.cms.bean.Article;
import com.kerwin.apps.cms.bean.extend.ArticleExtend;
import com.kerwin.apps.cms.service.IArticleService;
import com.kerwin.apps.cms.utils.Message;
import com.kerwin.apps.cms.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author kerwin
 * @title: ArticleController
 * @projectName cms
 * @date 2019/11/12 - 10:23
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    private final IArticleService iArticleService;

    @Autowired
    public ArticleController(IArticleService iArticleService) {
        this.iArticleService = iArticleService;
    }

    @GetMapping("/find")
    public Message findAll(){
        List<ArticleExtend> list = iArticleService.findAll();
        return MessageUtil.success(list);
    }

    @GetMapping("findById")
    public Message findById(Long id){
        ArticleExtend byId = iArticleService.findById(id);
        return MessageUtil.success(byId);
    }

    @PostMapping("/saveOrUpdate")
    public Message saveOrUpdate(Article article){
        iArticleService.saveOrUpdate(article);

        return MessageUtil.success("更新成功！");
    }

}
