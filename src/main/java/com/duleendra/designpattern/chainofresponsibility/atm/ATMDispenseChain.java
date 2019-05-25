package com.duleendra.designpattern.chainofresponsibility.atm;

import java.util.Scanner;

public class ATMDispenseChain {

    public static void main(String[] args) {

        DispenseChain c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);

        while (true){

            System.out.println("Enter amount to dispense");

            int amount =0;
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            c1.dispense(new Currency(amount));
        }
    }
}
