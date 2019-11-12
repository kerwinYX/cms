package com.kerwin.apps.cms.service.impl;

import com.kerwin.apps.cms.bean.extend.ArticleExtend;
import com.kerwin.apps.cms.dao.extend.ArticleExtendMapper;
import com.kerwin.apps.cms.service.IArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author kerwin
 * @title: ArticleServiceImpl
 * @projectName cms
 * @date 2019/11/12 - 10:24
 */
@Service
public class ArticleServiceImpl implements IArticleService {

    @Resource
    private ArticleExtendMapper articleExtendMapper;

    @Override
    public List<ArticleExtend> findAll() {
        return articleExtendMapper.selectAll();
    }
}
