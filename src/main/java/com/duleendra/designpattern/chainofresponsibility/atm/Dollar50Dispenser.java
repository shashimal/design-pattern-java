package com.duleendra.designpattern.chainofresponsibility.atm;

public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 50) {
            int numOf50Notes = currency.getAmount() / 50;
            int currencyReminder = currency.getAmount() % 50;

            System.out.println("Dispensing "+numOf50Notes+" 50$ note");

            if(currencyReminder != 0) {
                this.nextChain.dispense(new Currency(currencyReminder));
            }

        }else {
            this.nextChain.dispense(currency);
        }
    }
}
