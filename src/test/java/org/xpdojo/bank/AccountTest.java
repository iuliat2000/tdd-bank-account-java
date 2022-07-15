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
    public void depositANegativeAmountNotAllowed() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
        account.deposit(100);
        account.deposit(-50);
        assertThat(account.balance()).isEqualTo(100);
    }

    @Test
    public void withdrawAnAmountToDecreaseTheBalance() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
        account.deposit(50);
        account.withdraw(10);
        assertThat(account.balance()).isEqualTo(40);
    }

    @Test
    public void withdrawTwoAmountsToDecreaseTheBalance() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
        account.deposit(50);
        account.withdraw(10);
        account.withdraw(10);
        assertThat(account.balance()).isEqualTo(30);
    }

    @Test
    public void withdrawNegativeAmountNotAllowed() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
        account.deposit(50);
        account.withdraw(-10);
        assertThat(account.balance()).isEqualTo(50);
    }

    @Test
    public void withdrawAmountThatExceedsBalance() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
        account.deposit(50);
        account.withdraw(100);
        assertThat(account.balance()).isEqualTo(50);
    }

}
