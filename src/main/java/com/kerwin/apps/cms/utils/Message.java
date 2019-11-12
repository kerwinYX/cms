package com.kerwin.apps.cms.utils;

/**
 * @author kerwin
 * @title: Message
 * @projectName cms
 * @date 2019/11/12 - 15:14
 */
public class Message {
    private Integer status;   //状态码
    private String message;   //信息
    private Object data;           //携带的数据 结果数据等等
    private Long timestamp;   //时间戳

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
