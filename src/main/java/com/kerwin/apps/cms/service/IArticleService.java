package com.kerwin.apps.cms.service;

import com.kerwin.apps.cms.bean.Article;
import com.kerwin.apps.cms.bean.extend.ArticleExtend;

import java.util.List;

/**
 * @author kerwin
 * @title: IArticleService
 * @projectName cms
 * @date 2019/11/12 - 10:24
 */
public interface IArticleService {

    List<ArticleExtend> findAll();
    ArticleExtend findById(Long id);
    void saveOrUpdate(Article article);
}
