package com.kerwin.apps.cms.config;

/**
 * @author kerwin
 * @title: UnAuthorizedException
 * @projectName cms
 * @date 2019/11/29 - 10:13
 */
public class UnAuthorizedException extends MyException {
    public UnAuthorizedException() {
    }

    public UnAuthorizedException(String message) {
        super(message);
    }

    public UnAuthorizedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnAuthorizedException(Throwable cause) {
        super(cause);
    }

    public UnAuthorizedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
