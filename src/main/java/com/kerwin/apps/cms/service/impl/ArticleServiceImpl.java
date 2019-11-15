package com.kerwin.apps.cms.service.impl;

import com.kerwin.apps.cms.bean.Article;
import com.kerwin.apps.cms.bean.ArticleExample;
import com.kerwin.apps.cms.bean.extend.ArticleExtend;
import com.kerwin.apps.cms.config.MyException;
import com.kerwin.apps.cms.dao.ArticleMapper;
import com.kerwin.apps.cms.dao.extend.ArticleExtendMapper;
import com.kerwin.apps.cms.dao.extend.CommentExtendMapper;
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
    @Resource
    private ArticleMapper articleMapper;
    @Resource
    private CommentExtendMapper commentExtendMapper;

    @Override
    public List<ArticleExtend> findAll() {
        return articleExtendMapper.selectAll();
    }



    @Override
    public ArticleExtend findById(Long id) {
        return articleExtendMapper.selectById(id);
    }

    @Override
    public void saveOrUpdate(Article article) {
        if (article.getId() != null){
            articleMapper.updateByPrimaryKey(article);
        }else {
//            文章标题不能重复
            ArticleExample example = new ArticleExample();
            example.createCriteria().andTitleEqualTo( article.getTitle());
            List<Article> articles = articleMapper.selectByExample(example);
            if(articles.size()>0){
                throw new MyException("文章标题不能重复！！");
            }

            article.setPublishTime(System.currentTimeMillis());
            article.setStatus(ArticleExtend.STATUS_UNCHECK);
            article.setThumbDown(1L);
            article.setThumbUp(1L);
            articleMapper.insert(article);
        }
    }
}
