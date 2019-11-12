package com.kerwin.apps.cms.utils;

/**
 * @author kerwin
 * @title: MessageUtil
 * @projectName cms
 * @date 2019/11/12 - 15:17
 */
public class MessageUtil {

//    错误信息格式   用于增删改操作的结果返回
    public static Message error(String msg){
        Message message = new Message();
        message.setStatus(500);
        message.setMessage(msg);
        message.setTimestamp(System.currentTimeMillis());
        return message;
    }


//    成功信息格式    用于增删改操作的结果返回
    public static Message success(String msg){
        Message message = new Message();
        message.setStatus(200);
        message.setMessage(msg);
        message.setTimestamp(System.currentTimeMillis());
        return message;
    }


    //    错误信息格式   用于查询操作的结果返回
    public static Message error(String msg,Object data){
        Message message = new Message();
        message.setStatus(500);
        message.setData(data);
        message.setMessage(msg);
        message.setTimestamp(System.currentTimeMillis());
        return message;
    }

    //    成功信息格式    用于增删改操作的结果返回
    public static Message success(Object data){
        Message message = new Message();
        message.setStatus(200);
        message.setMessage("success");
        message.setData(data);
        message.setTimestamp(System.currentTimeMillis());
        return message;
    }
}
