package com.duleendra.designpattern.chainofresponsibility.atm;

public class Dollar20Dispenser implements DispenseChain {

    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 20) {
            int numOf20Notes = currency.getAmount() / 20;
            int currencyReminder = currency.getAmount() % 20;

            System.out.println("Dispensing "+numOf20Notes+" 20$ note");

            if(currencyReminder != 0) {
                this.nextChain.dispense(new Currency(currencyReminder));
            }

        }else {
            this.nextChain.dispense(currency);
        }
    }
}
