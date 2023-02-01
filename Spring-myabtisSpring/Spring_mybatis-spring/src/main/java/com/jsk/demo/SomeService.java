package com.jsk.demo;
/**
 * 反射机制被实例化类
 * @author jack
 * @date 2023/1/31 20:15
 *
 */

public class SomeService {
    public SomeService(){
        System.out.println("SomeService被实例化");
    }
    public void doSome(){
        System.out.println("调用了doSome()方法！");
    };
    public void doSome(String username){
        System.out.println("调用了doSome(String username)"+" 您好:"+username);
    }
    public int doSome(String username,int age){
        System.out.println("调用了doSome(String username,int age)"+" 您好:"+username+"年龄："+age);
        return 1;
    }
}
