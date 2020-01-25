package com.geely.design.pattern.structural.decorator.v2;

public abstract class AbstaractorDecorator extends ABattercake {

    private ABattercake aBattercake;

    public AbstaractorDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}