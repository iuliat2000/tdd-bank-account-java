package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
//import static org.hamcrest.MatcherAssert.AssertThat;
//import static org.hamcrest.Matchers.*;

public class AccountTest {

    @Test
	public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
        account.deposit(100);
        assertThat(account.balance()).isEqualTo(100);
    }

    @Test
    public void depositTwoAmountsToIncreaseTheBalance() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
        account.deposit(100);
        account.deposit(50);
        assertThat(account.balance()).isEqualTo(150);
    }

    @Test
    public void depositANegativeAmountToDecreaseTheBalance() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
        account.deposit(100);
        account.deposit(-50);
        assertThat(account.balance()).isEqualTo(50);
    }
    @Test
    public void depositNegativeAmountExceedsBalance() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
        account.deposit(50);
        account.deposit(-100);
        assertThat(account.balance()).isEqualTo(50);
    }

}
