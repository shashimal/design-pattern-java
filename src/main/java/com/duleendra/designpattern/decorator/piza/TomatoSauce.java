package com.duleendra.designpattern.decorator.piza;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Piza piza) {
        super(piza);
        System.out.println("Tomato");
    }

    @Override
    public String getDescription() {
        return this.piza.getDescription() + ", tomato sauce";
    }

    @Override
    public double getCost() {
        return this.piza.getCost() + .35;
    }
}
