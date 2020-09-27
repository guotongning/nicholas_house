package com.ning.nicholas_house.exception;

/**
 * @author 不在能知，乃在能行 ——nicholas
 * @description
 * @date 2020/9/27 17:41
 */
public class TexasException extends Exception {
    public TexasException() {
    }

    public TexasException(String message) {
        super(message);
    }

    public TexasException(String message, Throwable cause) {
        super(message, cause);
    }

    public TexasException(Throwable cause) {
        super(cause);
    }

    public TexasException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
