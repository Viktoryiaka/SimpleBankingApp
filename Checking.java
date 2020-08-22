package com.company;

public class Checking extends Account {
    int checkingAmount;

    public Checking(){
        super();
        checkingAmount = 0;
    }

    @Override
    public void addMoney(int amount) {
        checkingAmount += amount;
    }

    @Override
    public void withdraw(int amount) {
        checkingAmount -= amount;
    }
}
