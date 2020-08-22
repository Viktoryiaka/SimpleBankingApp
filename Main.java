package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Alan Walker");
        Saving saving = new Saving();
        Checking checking = new Checking();
        saving.addMoney(5000);
        checking.addMoney(10000);
        saving.withdraw(3000);
        checking.withdraw(1500);
        System.out.println(customer.fullName+"'s checking account amount is $" + checking.checkingAmount +
                " and savings account amount is $" + saving.currentAmount + ".");
    }
}
