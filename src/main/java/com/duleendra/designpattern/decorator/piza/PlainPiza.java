package com.duleendra.designpattern.decorator.piza;

public class PlainPiza implements Piza {

    public PlainPiza() {
        System.out.println("Plain");
    }

    @Override
    public String getDescription() {
        return "Thin dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
