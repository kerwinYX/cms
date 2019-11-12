package com.kerwin.apps.cms.config;

/**
 * @author kerwin
 * @title: MyExceptionHandler
 * @projectName cms
 * @date 2019/11/12 - 16:51
 */

import com.kerwin.apps.cms.utils.Message;
import com.kerwin.apps.cms.utils.MessageUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionHandler {


    @ExceptionHandler(MyException.class) // 捕获 Controller 中抛出的指定类型的异常，也可以指定其他异常
    public Message handler(Exception exception){
        exception.printStackTrace();
        return MessageUtil.error(exception.getMessage());
    }

}
