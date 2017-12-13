package com.apust.Multithreading.Tkach.BankAccaunt;

/**
 * Created by GUN on 3/22/2015.
 */
public class Accaunt {

    private int balance;

    public int getBalance() {
        return balance;
    }
    public Accaunt(int initialBalance) {
        this.balance = initialBalance;
    }

    public void withDraw(int amount){
        balance -= amount;
    }
    public void deposit(int amount){
        balance += amount;
    }


}
