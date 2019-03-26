package com.luban.annotatethebook.test;

import com.luban.annotatethebook.conf.AppConfig;
import com.luban.util.AnnotationConfigApplicationContext;

/**
 * @author 皇甫
 */
public class ConfigTest {
    public static void main(String[] args) throws ClassNotFoundException {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        annotationConfigApplicationContext.getTYpePath();

    }

}
