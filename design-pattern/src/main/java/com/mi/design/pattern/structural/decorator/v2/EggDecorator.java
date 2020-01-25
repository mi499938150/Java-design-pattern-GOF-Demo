package com.geely.design.pattern.structural.decorator.v2;

public class EggDecorator extends AbstaractorDecorator {

    @Override
    protected void doSomething() {

    }

    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() +"加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}