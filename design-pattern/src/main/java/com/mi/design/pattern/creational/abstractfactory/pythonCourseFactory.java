package com.geely.design.pattern.creational.abstractfactory;

public class pythonCourseFactory implements CourseFactory {


    public Video getVideo() {
        return new PythonVideo();
    }

    public Article getArticle() {
        return new pythonArticle();
    }
}