package com.libqa.account;

import com.libqa.account.domain.Account;
import com.libqa.account.domain.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : yion
 * @Date : 2017. 4. 15.
 * @Description :
 */
public class AccountServiceImpl implements AccountService {
    @Override
    public Account createNewAccount(Account account) {
        // dummy dao
        // dao.insert(account)

        return account;
    }

    @Override
    public Account updateAccount(Account account) {
        // dummy dao
        // dao.update
        account.setName("LEE new User");

        return account;
    }

    @Override
    public boolean removeAccount(Account account) {

        // dummy dao
        // dao.remove
        return true;
    }

    @Override
    public List<Transaction> listTransaction(Account account) {

        List lists = new ArrayList();
        lists.add(new Transaction());
        lists.add(new Transaction());
        lists.add(new Transaction());

        account.setTransactions(lists);

        return lists;
    }
}
