package com.geely.design.pattern.structural.decorator.v1;

public class Test {

    public static void main(String args[]){

        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc()+"   销售价格:\t"+battercake.cost());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc()+"   销售价格:\t"+battercakeWithEgg.cost());

        Battercake battercakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc()+"  销售价格:\t"+battercakeWithEggSausage.cost());

    }
}