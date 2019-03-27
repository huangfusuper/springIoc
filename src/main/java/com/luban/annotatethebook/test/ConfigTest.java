package com.luban.annotatethebook.test;

import com.luban.annotatethebook.conf.AppConfig;
import com.luban.annotatethebook.service.UserService;
import com.luban.util.AnnotationConfigApplicationContext;

/**
 * @author 皇甫
 */
public class ConfigTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService= (UserService) annotationConfigApplicationContext.getBean("userService");
        String user = userService.findUser();
        System.out.println(user);
    }

}
