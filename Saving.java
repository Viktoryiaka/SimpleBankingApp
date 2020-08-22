package com.company;

public class Saving extends Account {
    int currentAmount;

    public Saving(){
        super();
        currentAmount = 0;
    }

    @Override
    public void addMoney(int amount) {
        currentAmount += amount;
    }

    @Override
    public void withdraw(int amount) {
        currentAmount -= amount;
    }
}
