package com.kebo;

/**
 * @description: throws关键字
 * @author: kb
 * @create: 2020-08-13 21:53
 **/
public class ThrowsDemo01 {
    public static void main(String[] args) {
        Math math = new Math();
        try {
            System.out.println("除法操作：" + math.div(2, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Math {
    public int div(int i, int j) throws Exception {
        int temp = i / j;
        return temp;
    }
}

