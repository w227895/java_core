package com.kebo;

/**
 * @description: throw关键字
 * @author: kb
 * @create: 2020-08-13 22:13
 **/
public class ThrowDemo01 {
    public static void main(String[] args) {
        try {
            throw new Exception("自己定义的异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

