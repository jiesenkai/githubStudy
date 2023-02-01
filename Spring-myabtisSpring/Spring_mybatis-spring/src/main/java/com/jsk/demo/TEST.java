package com.jsk.demo;

import java.lang.reflect.Method;

/**
 * 反射机制的测试类
 * @author jack
 * @date 2023/1/31 20:19
 */

public class TEST {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("com.jsk.demo.SomeService");
        Method doSome = aClass.getDeclaredMethod("doSome",String.class,int.class);
        Object 小凯 = doSome.invoke(aClass.newInstance(), "小凯", 19);
//        System.out.println(小凯);
    }

}
