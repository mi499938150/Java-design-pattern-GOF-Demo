package com.geely.design.pattern.creational.singleton;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 懒汉式  使用它的使用才会创建
 * 单列  线程安全
 * 多线程  不安全
 * 通过 synchronized 关键字同步
 *
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    /**
     * 模拟反射
     */
    //   private static  boolean flag = true;

    /**
     * 实例调用顺序
     */
    public LazySingleton() {
//        if (flag){
//            flag = false;
//        }else {
//            throw  new RuntimeException("单例构造器禁止反射调用");
//        }
        if (lazySingleton != null) {
            throw new RuntimeException("单例构造器紧张反射调用");
        }
    }

    //第一种改进方式  synchronized  在静态方法同步    消耗资源
    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

//    public static void main(String args[]) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Class obejctClass = LazySingleton.class;
//        Constructor constructor = obejctClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//
//
//        LazySingleton o1 = LazySingleton.getInstance();
//
//        /*改变 破环他  把flag弄成true*/
//        Field flag = o1.getClass().getDeclaredField("flag");
//        flag.setAccessible(true);
//        flag.set(o1,true);
//
//
//        LazySingleton o2 = (LazySingleton) constructor.newInstance();
//        System.out.println(o1);
//        System.out.println(o2);
//        System.out.println(o1 == o2);
//
//    }

}