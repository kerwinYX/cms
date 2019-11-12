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
    private Category category;
    private User user;
    private List<Comment> comments;

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }



    public ArticleExtend() {
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
