package com.duleendra.designpattern.chainofresponsibility.atm;

public class Dollar10Dispenser implements DispenseChain {

    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 10) {
            int numOf10Notes = currency.getAmount() / 10;
            int currencyReminder = currency.getAmount() % 10;

            System.out.println("Dispensing "+numOf10Notes+" 10$ note");

            if(currencyReminder != 0) {
                this.nextChain.dispense(new Currency(currencyReminder));
            }

        }else {
            this.nextChain.dispense(currency);
        }
    }
}
