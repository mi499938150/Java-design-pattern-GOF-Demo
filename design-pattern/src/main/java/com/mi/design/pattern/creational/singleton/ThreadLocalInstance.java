package com.geely.design.pattern.creational.singleton;


/**
 *  带引号的线程单例模式
 *  基于线程
 *  多线程的共享
 *  获取的对象是唯一的
 */
public class ThreadLocalInstance {


    private ThreadLocalInstance(){}

    //进行重写初始化
    private static  final ThreadLocal<ThreadLocalInstance> threadLocalInstance
             = new ThreadLocal<ThreadLocalInstance>(){

        protected ThreadLocalInstance initialValue(){
            return new ThreadLocalInstance();
        }
    };

    public static ThreadLocalInstance getInstance(){
        return threadLocalInstance.get();
    }
}