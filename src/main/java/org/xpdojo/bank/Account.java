package org.xpdojo.bank;

public class Account {
    private int amount=0;

    public void deposit(int i) {
        if (amount + i >= 0)
            amount = amount + i;
        else
            ; // rollback transaction
        //TODO later: raise exception
    }

    public int balance() {
        return amount;
    }
}
