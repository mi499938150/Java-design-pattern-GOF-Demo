package com.geely.design.pattern.creational.singleton;

/**
 * 线程安全
 * 基于类初始化的延迟加载解决方案
 * 核心InnerClass
 */
public class StatiInnerClassSingleton {


    public StatiInnerClassSingleton() {
        if (InnerClass.statiInnerClassSingleton !=null){
            throw  new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private static class  InnerClass{
        private static   StatiInnerClassSingleton statiInnerClassSingleton =  new StatiInnerClassSingleton();
    }

    public static StatiInnerClassSingleton getInstance(){
        return InnerClass.statiInnerClassSingleton;
    }
}