package com.geely.design.pattern.creational.singleton;

/**
 * doublecheck 关注 双重检查
 * 检查放在方法体中
 */
public class LazyDoubleCheckSingleton {

    /**
     * volatile 加载安全
     */
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    public LazyDoubleCheckSingleton() {

    }
    //第一种改进方式  synchronized  在静态方法同步    消耗资源
    public  static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton == null){

                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1. 分配内存
                    //3. 设置 lazyDoubleCheckSingleton 指向刚分配的内容地址
                    //2. 初始化对象
                    // intra-thread semantice 重排序 ----------3. 设置 lazyDoubleCheckSingleton 指向刚分配的内容地址
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}