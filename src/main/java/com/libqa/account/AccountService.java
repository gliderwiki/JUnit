package com.libqa.account;

import com.libqa.account.domain.Account;
import com.libqa.account.domain.Transaction;

import java.util.List;

/**
 * @Author : yion
 * @Date : 2017. 4. 15.
 * @Description :
 */
public interface AccountService {

    Account createNewAccount(Account account);

    Account updateAccount(Account account);

    boolean removeAccount(Account account);

    List<Transaction> listTransaction(Account account);
}
