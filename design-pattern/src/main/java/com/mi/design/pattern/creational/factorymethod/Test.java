package com.geely.design.pattern.creational.factorymethod;

public class Test {

       public static void main(String args[]){

          Factory factory = new JavaVideoFactory();
          
          Video video = factory.getVideo();
          video.produce();


       }
}