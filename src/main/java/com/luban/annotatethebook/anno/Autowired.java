package com.luban.annotatethebook.anno;

import java.lang.annotation.*;

/**
 * 自动注入
 */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Autowired {
}
