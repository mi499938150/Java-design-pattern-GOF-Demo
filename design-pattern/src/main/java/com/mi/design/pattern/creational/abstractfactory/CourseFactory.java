package com.geely.design.pattern.creational.abstractfactory;


/**
 *   1.声明接口
 *   2.创建业务抽象类方法
 *   3.用子类继续父类实现业务方法
 *   4.都是属于一个产品族
 *   5.不适合经常改
 */

public interface CourseFactory {

    Video getVideo();

    Article getArticle();

}