package org.xpdojo.bank;

public class Account {
    private int amount=0;

    public void deposit(int i) {
        if ( i < 0)
            return;

        amount = amount + i;
    }

    public int balance() {
        return amount;
    }

    public void withdraw(int i) {
        if ( i < 0)
            return;

        if (amount - i < 0)
            return;
        //TODO add error message

        amount = amount - i;;
    }
}
