package com.kerwin.apps.cms.bean.extend;

import com.kerwin.apps.cms.bean.Article;
import com.kerwin.apps.cms.bean.Category;
import com.kerwin.apps.cms.bean.Comment;
import com.kerwin.apps.cms.bean.User;

import java.util.List;

/**
 * @author kerwin
 * @title: ArticleExtend
 * @projectName cms
 * @date 2019/11/12 - 10:26
 */
public class ArticleExtend extends Article {

    public static final String STATUS_UNCHECK = "未审核";
    public static final String STATUS_CHECK_PASS = "审核通过";
    public static final String STATUS_CHECK_NOPASS = "审核未通过";

    private Category category;
    private List<Comment> comments;

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
