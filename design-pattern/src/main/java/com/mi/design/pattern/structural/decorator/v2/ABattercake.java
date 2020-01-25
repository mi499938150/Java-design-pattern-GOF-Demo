package com.geely.design.pattern.structural.decorator.v2;

/**
 * 1.创建一个抽象的类
 * 2.再创建一个具体的类实现抽象的类方法
 * 3.交给一个装饰类给其他要装饰的类去继承
 *
 */
public abstract class ABattercake {

    protected abstract String getDesc();


    protected abstract int cost();


}