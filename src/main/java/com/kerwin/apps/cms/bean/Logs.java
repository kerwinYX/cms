package com.kerwin.apps.cms.bean;

import java.util.Date;

public class Logs {
    private Long id;

    private Date action_time;

    private Long user_id;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAction_time() {
        return action_time;
    }

    public void setAction_time(Date action_time) {
        this.action_time = action_time;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}