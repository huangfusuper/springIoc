package com.luban.util;

import com.luban.annotatethebook.anno.ComponentScan;

import java.io.File;
import java.lang.annotation.Annotation;

/**
 * 自定义版本的注解扫描
 * @author 皇甫
 */
public class AnnotationConfigApplicationContext {
    private Class target;
    public AnnotationConfigApplicationContext(Class target) {
        this.target = target;
    }

    public String getTYpePath() throws ClassNotFoundException {
        if(target.isAnnotationPresent(ComponentScan.class)){
            ComponentScan componentScanValue = (ComponentScan) target.getAnnotation(ComponentScan.class);
            String packagePath = componentScanValue.value();
            //将包名转换为路径名称
            String path = packagePath.replaceAll("\\.","/" );
            //获取当前项目根路径
            String rootPackagePath = this.getClass().getResource("/").getPath();
            String targetPackagePath = rootPackagePath+path;
            File file = new File(targetPackagePath);
            //测试是否能拿到包名
            String[] list = file.list();
            for (String s : list) {
                System.out.println(s);
            }

        }else{
            throw new CannotFindAnnotations("找不到"+ComponentScan.class+"注解");
        }
        return null;
    }
}
