package com.luban.test;

import com.luban.service.UserService;
import com.luban.util.SpringBeanFactory;
import org.junit.Test;

/**
 * @author 皇甫
 */
public class TestSpringIoc {
    @Test
    public void test1(){
        SpringBeanFactory springBeanFactory = new SpringBeanFactory();

        springBeanFactory.springBeanFactory("spring.xml");
        UserService service = (UserService) springBeanFactory.getBean("service");
        service.find();
    }
}
