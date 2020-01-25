package com.geely.design.pattern.creational.factorymethod;

public class JavaVideoFactory extends  Factory {

    public Video getVideo() {
        return new JavaVideo();
    }
}