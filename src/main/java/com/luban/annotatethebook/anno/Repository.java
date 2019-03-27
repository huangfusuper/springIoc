package com.luban.annotatethebook.anno;

import jdk.nashorn.internal.objects.annotations.Property;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 标注DAO
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Repository {
    public String value() default "";
}
