package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    static String compress(String src) {
        StringBuffer ret = new StringBuffer();
        int p1 = 0;
        int count = 0;
        int len = src.length();
        while (p1 < len) {
            if (p1 + 1 < len && src.charAt(p1) == src.charAt(p1 + 1)) {
                count = 1;
                int p2 = p1 + 1;
                while (p2 < len && src.charAt(p2) == src.charAt(p1)) {
                    count++;
                    p2++;
                }
                ret.append(src.charAt(p1));
                ret.append(count);
                p1 = p2;

            } else {
                ret.append(src.charAt(p1));
                ret.append(1);
                p1++;
            }
        }
        return ret.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    /**
     * 交换两个数
     *
     * @param a
     * @param b
     */
    public static void exchangeTwoNum(int a, int b) {
        // 方式一
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println("a="+a+"b="+b);
        // 方式二 不用定义临时变量（但相加可能会溢出）
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("a=+"+a+"b="+b);
        // 方式三 位运算
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a=+_" + a + "b=" + b);

    }

//    public static void main(String[] args) {
//
//        /**
//         * 二进制转十进制
//         * @param args
//         */
////        String strng = "aaabbbccccc";
////        String result=compress(strng);
////        System.out.println(result);
//        exchangeTwoNum(10,20);
//
//        /**
//         * 位运算
//         */
//        int a=128;
//        int b=129;
//        System.out.println(a&b);
//        System.out.println(a|b);
//        System.out.println(~a);
//        System.out.println(a^b);
//
//    }

}
