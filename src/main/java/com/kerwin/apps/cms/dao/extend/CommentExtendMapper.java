package com.kerwin.apps.cms.dao.extend;

import com.kerwin.apps.cms.bean.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kerwin
 * @title: CommentExtendMapper
 * @projectName cms
 * @date 2019/11/12 - 17:14
 */
public interface CommentExtendMapper {

    List<Comment> selectByArticleId(@Param("article_id") long article_id);
}
