package com.jsk.reflect;

/**
 * 反射机制 练习
 * @author jack
 * @date 2023/1/31 23:31
 */


public class reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        //方式一 Class.forName()
        Class<?> c1 = Class.forName("com.jsk.reflect.animal");
        System.out.println(c1.hashCode());
        Class<?> c2 = Class.forName("com.jsk.reflect.animal");
        System.out.println(c2.hashCode());
        //方式二 类名.class
        Class<animal> c3 = animal.class;
        System.out.println(c3.hashCode());
        Class<animal> c4 = animal.class;
        System.out.println(c4.hashCode());
        //方式三 对象.getClass()
        Class<? extends animal> c5 = new animal().getClass();



    }
}
