package com.geely.design.pattern.creational.abstractfactory;




public class Test {

    public static void main(String args[]){
        CourseFactory courseFactory = new JavaCourseFacotry();
        Video video = courseFactory.getVideo();
        video.produce();
        Article article = courseFactory.getArticle();
        article.produce();
    }
}