package org.leorodriguez.introtojavabasics;

public class SaverDriver {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        saver2.modifyInterestRate(3.0);
        saver1.modifyInterestRate(3.0);
        System.out.println(saver1.getMonthlyInterestRate());
        System.out.println(saver2.getMonthlyInterestRate());
        saver2.modifyInterestRate(4.0);
        saver1.modifyInterestRate(4.0);
        System.out.println(saver1.getMonthlyInterestRate());
        System.out.println(saver2.getMonthlyInterestRate());

    }
}
