package com.jollycorp.data.main;

import com.jollycorp.data.service.FeatureService;
import com.jollycorp.data.service.impl.FeatureServiceImpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 主方法类
public class NewFeature {
    public static void main(String[]args) {
        /*****************default*********************/
        /*FeatureService service = new FeatureServiceImpl();
        System.out.println(service.sqrt(4));*/

        /*****************lambda*********************/
        // 1.8之前
        /*List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                //System.out.println(a + "-" + b);
                return b.compareTo(a);
            }
        });
        System.out.println(names);*/

        // 1.8
        /*List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (String a, String b) ->{
            // 通过a和b的前后决定正序、反序排列
            return a.compareTo(b);
        });
        System.out.println(names);*/
    }
}
