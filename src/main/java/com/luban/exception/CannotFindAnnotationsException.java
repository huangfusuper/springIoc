package com.luban.exception;

/**
 * 找不到配置注解异常类
 * @author 皇甫
 */
public class CannotFindAnnotationsException extends RuntimeException {
    public CannotFindAnnotationsException(String msg) {
        super(msg);
    }
}
