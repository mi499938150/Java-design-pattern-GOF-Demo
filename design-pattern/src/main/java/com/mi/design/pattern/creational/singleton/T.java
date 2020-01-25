package com.geely.design.pattern.creational.singleton;


/**
 * 多线程Dug
 */

public class T implements Runnable {
    public void run() {
//          LazySingleton lazySingleton = LazySingleton.getInstance();

//        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();

//         StatiInnerClassSingleton singleton = StatiInnerClassSingleton.getInstance();

        /**有隐患 不安全*/
//        ContainerSingleton.putInstance("object",new Object());
//        Object instance = ContainerSingleton.getInstance("object");

        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName()+"\t"+instance);
    }
}