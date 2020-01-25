package com.geely.design.pattern.creational.singleton;

import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * 懒汉式 饿汉式 区别在类加载
 * 饿汉式   类加载的时候已经初始化好了
 */
public class HungrySingleton implements Serializable {

    private final static HungrySingleton hungrySingleton;

    //静态快
    static {
        hungrySingleton = new HungrySingleton();
    }

    /**
     * 反射防御
     * 对于这种单例模式和静态类有效
     */
    private HungrySingleton() {
             if (hungrySingleton !=null){
                 throw  new RuntimeException("单例构造器禁止反射调用");
             }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    /**
     * 避免反序列化 为true
     */
    private Object readResolve(){
        return hungrySingleton;
    }
}