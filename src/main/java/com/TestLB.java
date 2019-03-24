package com;

import org.junit.Test;

import javax.swing.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 皇甫
 */
public class TestLB {
    @Test
    public void test1() throws IOException {
        File file = new File("C:\\Users\\皇甫\\Desktop\\a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bis = new BufferedReader(inputStreamReader);

        File fileOut = new File("C:\\Users\\皇甫\\Desktop\\b.txt");
        PrintWriter printWriter = new PrintWriter(fileOut);


        String str = bis.readLine();
        //<li data-value="0002" data-label="0002-港二公司" class="autocompleter-item">0002-港二公司</li>
        while (str !=null){
            String r = "<li data-value=\"(\\d+)\" data-label=\"(\\d+\\-[\\u4e00-\\u9fa5]+)\" class=\"autocompleter-item\">(\\d+\\-[\\u4e00-\\u9fa5]+)</li>";
            Pattern pattern = Pattern.compile(r);
            Matcher matcher = pattern.matcher(str);
            if(matcher.find()){
                printWriter.println(matcher.group(1)+"\t"+matcher.group(2)+"\t"+matcher.group(3));
            }
            str = bis.readLine();
        }

        printWriter.flush();
        printWriter.close();
        bis.close();


    }
}
