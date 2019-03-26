package com.luban.util;

import com.luban.annotatethebook.anno.ComponentScan;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/**
 * 自定义版本的注解扫描
 * @author 皇甫
 */
public class AnnotationConfigApplicationContext {
    private Class target;
    private String fullyQualifiedName;
    public AnnotationConfigApplicationContext(Class target) {
        this.target = target;
    }

    public String getTYpePath() throws ClassNotFoundException {
        if(target.isAnnotationPresent(ComponentScan.class)){
            ComponentScan componentScanValue = (ComponentScan) target.getAnnotation(ComponentScan.class);
            String packagePath = componentScanValue.value();
            fullyQualifiedName = packagePath;
            String path = packagePath.replaceAll("\\.","/" );
            String rootPackagePath = this.getClass().getResource("/").getPath();
            String targetPackagePath = rootPackagePath+path;
            File file = new File(targetPackagePath);
            List<String> list = new ArrayList<String>();
            list = getPaths(file, list);
            List<String> fullyQualifiedNames = getFullyQualifiedName(list);
            List<Class> classArray = getClassArray(fullyQualifiedNames);
            for (Class aClass : classArray) {
                System.out.println(aClass.getSimpleName());
            }

        }else{
            throw new CannotFindAnnotations("找不到"+ComponentScan.class+"注解");
        }
        return null;
    }

    public List<String> getPaths(File filePath,List<String> paths){
        File[] files = filePath.listFiles();
        if(files.length == 0){
            return null;
        }
        for (File file : files) {
            if(file.isDirectory()){
                getPaths(file,paths);
            }else{
                paths.add(file.getPath());
            }
        }
        return paths;
    }

    public List<String> getFullyQualifiedName(List<String> list){
        List<String> fullyQualifiedNames = new ArrayList<String>();
        for (String name : list) {
            String s = name.replaceAll("\\\\", "\\.");
            String substring = s.substring(s.indexOf(fullyQualifiedName), (s.length() - 6));
            fullyQualifiedNames.add(substring);
        }
        return fullyQualifiedNames;
    }

    public List<Class> getClassArray(List<String> list){
        List<Class> classes = new ArrayList<Class>();
        for (String fullyQualifiedName : list) {
            try {
                Class clazz = Class.forName(fullyQualifiedName);
                classes.add(clazz);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return classes;
    }
}
