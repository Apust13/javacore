package com.apust.Multithreading.Tkach.BankAccaunt;

/**
 * Created by GUN on 3/22/2015.
 */
public class Operations {

    static void transfer(Accaunt acc1, Accaunt acc2, int amount){
        if (acc1.getBalance() < amount) System.out.println("Exception");;

        acc1.withDraw(amount);
        acc2.deposit(amount);

        System.out.println("Transfer succesfull");
    }

    public static void main(String[] args) {
        final Accaunt a = new Accaunt(1000);
        final Accaunt b = new Accaunt(1000);

        new Thread(new Runnable(){
            @Override
            public void run() {
                transfer(a, b, 500);
            }
        }).start();

        transfer(b, a, 300);
    }


}
