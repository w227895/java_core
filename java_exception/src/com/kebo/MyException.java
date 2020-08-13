package com.kebo;

/**
 * @description: 自定义异常类
 * @author: kb
 * @create: 2020-08-13 22:18
 **/
public class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }

    public static void main(String[] args) {
        try {
            throw new MyException("这是我自定义的异常");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}

