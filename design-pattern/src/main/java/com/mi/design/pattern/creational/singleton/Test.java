package com.geely.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

    public static void main(String args[]) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

//        LazySingleton lazySingleton = LazySingleton.getInstance();
        /**  ThraedLocal 线程 主函数 拿的都一样*/
        System.out.println("main thrad :\t"+ThreadLocalInstance.getInstance());
        System.out.println("main thrad :\t"+ThreadLocalInstance.getInstance());
        System.out.println("main thrad :\t"+ThreadLocalInstance.getInstance());
        System.out.println("main thrad :\t"+ThreadLocalInstance.getInstance());
        System.out.println("main thrad :\t"+ThreadLocalInstance.getInstance());
        System.out.println("main thrad :\t"+ThreadLocalInstance.getInstance());

        System.out.println("ends");
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("ends");

//        HungrySingleton instance = HungrySingleton.getInstance();


        //放序列化的破坏
//        EnumInstance instance = EnumInstance.getInstance();
//        //持有的data 进行序列化
//        instance.setData(new Object());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleto_file"));
//        oos.writeObject(instance);


//        File file = new File("singleto_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(instance.getData() == newInstance.getData());


        /**
         * 反序列化的破坏   关注私有构造器防御破坏
         */
        //Class objectClass = HungrySingleton.class;

     //   Class objectClass = StatiInnerClassSingleton.class;

//        Class objectClass = LazySingleton.class;

        /**枚举反编译*/
//        Class objectClass = EnumInstance.class;

//        Constructor constructor = objectClass.getDeclaredConstructor(String.class,int.class);
//        constructor.setAccessible(true);
//        EnumInstance instance = (EnumInstance) constructor.newInstance("imi",666);
//
//        LazySingleton newInstance = (LazySingleton) constructor.newInstance();
//        LazySingleton instance = LazySingleton.getInstance();


     //  StatiInnerClassSingleton instance = StatiInnerClassSingleton.getInstance();
    //   StatiInnerClassSingleton newInstance = (StatiInnerClassSingleton) constructor.newInstance();

       //  HungrySingleton instance = HungrySingleton.getInstance();
     //   HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

//        EnumInstance instance = EnumInstance.getInstance();
//        instance.printTest();

    }
}