package com.kerwin.apps.cms.web.controller;

import com.kerwin.apps.cms.bean.extend.ArticleExtend;
import com.kerwin.apps.cms.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    public List<ArticleExtend>   test(){
        List<ArticleExtend> all = iArticleService.findAll();
        System.out.println(all);
        return all;
    }

    @GetMapping("findById")
    public ArticleExtend findById(Long id){
        return null;
    }

}
