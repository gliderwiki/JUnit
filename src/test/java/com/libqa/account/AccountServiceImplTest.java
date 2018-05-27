package com.libqa.account;

import com.libqa.account.domain.Account;
import org.junit.Test;

import static org.hamcrest.core.Is.isA;
import static org.junit.Assert.*;

/**
 * @Author : yion
 * @Date : 2017. 4. 15.
 * @Description :
 */
public class AccountServiceImplTest {
    AccountServiceImpl accountService = new AccountServiceImpl();

    @Test
    public void testCreateNewAccount() {
        Account newAccount = new Account();
        newAccount.setName("LEE");
        newAccount.setDescription("This is the description");

        Account insertAccount = accountService.createNewAccount(newAccount);

        assertThat(newAccount, isA(Account.class));
        assertEquals(newAccount.getName(), insertAccount.getName());

    }

    @Test
    public void testUpdateAccount() {
        Account oldAccount = new Account();
        oldAccount.setName("LEE");
        oldAccount.setDescription("This is the description");

        String name = oldAccount.getName();
        Account expectedAccount = new Account();
        expectedAccount = accountService.updateAccount(oldAccount);

        assertThat(expectedAccount, isA(Account.class));
        assertNotEquals(name, expectedAccount.getName());

    }

    @Test
    public void testRemoveAccount() {
        Account account = new Account();
        account.setName("LEE");

        assertTrue(accountService.removeAccount(account));
    }

    @Test
    public void testListTransaction() {
        Account account = new Account();
        account.setName("LEE");

        accountService.listTransaction(account);

        assertTrue(accountService.listTransaction(account).size() > 1);

    }



}
