package com.luban.exception;

/**
 * @author 皇甫
 */
public class RepeatAnnotationException extends RuntimeException {
    public RepeatAnnotationException(String msg){
        super(msg);
    }
}
