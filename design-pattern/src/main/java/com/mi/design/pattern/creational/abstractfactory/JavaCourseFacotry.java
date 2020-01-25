package com.geely.design.pattern.creational.abstractfactory;

public class JavaCourseFacotry implements CourseFactory {

    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}