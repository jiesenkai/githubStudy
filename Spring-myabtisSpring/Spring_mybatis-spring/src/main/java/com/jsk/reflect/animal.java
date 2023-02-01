package com.jsk.reflect;

public class animal {
    public String name;
}
class person extends animal{
    public person(){
        this.name = "jack";
    }
}
class cat extends animal{
    public cat(){
        this.name = "cat";
    }
}

