package com.kebo;

/**
 * @description: 在主方法上加入throws关键字
 * @author: kb
 * @create: 2020-08-13 22:04
 **/
public class ThrowsDemo02 {
    public static void main(String[] args) throws Exception {
        Math math = new Math();
        System.out.println("除法操作：" + math.div(2, 0));

    }
}

