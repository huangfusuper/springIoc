package com.luban.util;

/**
 * 找不到配置注解异常类
 * @author 皇甫
 */
public class CannotFindAnnotations extends RuntimeException {
    public CannotFindAnnotations(String msg) {
        super(msg);
    }
}
