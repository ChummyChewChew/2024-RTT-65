package org.leorodriguez.introtojavabasics;

public class SavingsAccount {
    //Initialing elements
    private static double annualInterestRate;
    private double savingsBalance;

    //Constructors
    SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    //Getters and setters

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    //Calculate monthly interest rate
    public double getMonthlyInterestRate() {
        double savingsIntrest = savingsBalance*(annualInterestRate/12);
        savingsBalance = savingsBalance + savingsIntrest;
        return savingsBalance;
    }
    public double modifyInterestRate(double alteredInterestRate) {
        annualInterestRate = alteredInterestRate;
        return annualInterestRate;
    }

}
