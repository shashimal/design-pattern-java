package com.duleendra.designpattern.decorator.piza;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Piza piza) {
        super(piza);
        System.out.println("Mozzarella");
    }

    @Override
    public String getDescription() {
        return this.piza.getDescription() +", mozzarella";
    }

    @Override
    public double getCost() {
        return this.piza.getCost() + .50;
    }
}
