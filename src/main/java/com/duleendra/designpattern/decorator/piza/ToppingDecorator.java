package com.duleendra.designpattern.decorator.piza;

public class ToppingDecorator implements Piza {
    protected Piza piza;

    public ToppingDecorator(Piza piza) {
        this.piza = piza;
    }

    @Override
    public String getDescription() {
        return piza.getDescription();
    }

    @Override
    public double getCost() {
        return piza.getCost();
    }
}
