package com.geely.design.pattern.creational.factorymethod;

public class FEVideoFactory  extends Factory {
    public Video getVideo() {
        return new FEVideo();
    }
}