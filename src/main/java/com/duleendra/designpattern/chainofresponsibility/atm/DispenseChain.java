package com.duleendra.designpattern.chainofresponsibility.atm;

public interface DispenseChain {

    void setNextChain(DispenseChain chain);
    void dispense(Currency cur);
}
