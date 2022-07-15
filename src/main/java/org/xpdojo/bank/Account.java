package org.xpdojo.bank;

public class Account {
    private int amount=0;

    public void deposit(int i) {
        amount = amount +i;
    }

    public int balance() {
    return amount;
    }
}
