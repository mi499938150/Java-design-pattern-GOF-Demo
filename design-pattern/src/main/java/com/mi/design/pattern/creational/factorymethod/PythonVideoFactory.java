package com.geely.design.pattern.creational.factorymethod;

public class PythonVideoFactory  extends Factory{


    public Video getVideo() {
        return new PythonVideo();
    }
}