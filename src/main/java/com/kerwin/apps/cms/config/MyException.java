package com.kerwin.apps.cms.config;

/**
 * @author kerwin
 * @title: MyException
 * @projectName cms
 * @date 2019/11/12 - 14:17
 */
public class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    protected MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public MyException() {
        super();
    }
}