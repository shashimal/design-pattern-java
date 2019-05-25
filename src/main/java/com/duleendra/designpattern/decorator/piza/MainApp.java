package com.duleendra.designpattern.decorator.piza;

public class MainApp {
    public static void main(String[] args) {
        Piza piza = new TomatoSauce(new Mozzarella(new PlainPiza()) );
        System.out.println(piza.getDescription());
        System.out.println(piza.getCost());
    }
}
