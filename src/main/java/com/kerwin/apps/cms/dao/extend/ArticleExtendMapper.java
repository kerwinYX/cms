package com.kerwin.apps.cms.dao.extend;

import com.kerwin.apps.cms.bean.extend.ArticleExtend;

import java.util.List;

/**
 * @author kerwin
 * @title: ArticleExtendMapper
 * @projectName cms
 * @date 2019/11/12 - 10:29
 */
public interface ArticleExtendMapper {

    List<ArticleExtend> selectAll();

    ArticleExtend selectById(Long id);
}
