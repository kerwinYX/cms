package com.kerwin.apps.cms.config;

/**
 * @author kerwin
 * @title: PermissionException
 * @projectName cms
 * @date 2019/11/29 - 10:11
 */
public class PermissionException extends MyException {
    public PermissionException() {
    }

    public PermissionException(String message) {
        super(message);
    }

    public PermissionException(String message, Throwable cause) {
        super(message, cause);
    }

    public PermissionException(Throwable cause) {
        super(cause);
    }

    public PermissionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
