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
        assertThat(account.balance()==0);
        account.deposit(100);
        assertThat(account.balance()==100);
    }
}
