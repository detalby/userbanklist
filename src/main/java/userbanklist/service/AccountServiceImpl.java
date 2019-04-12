package userbanklist.service;

import userbanklist.dao.AccountDAO;
import userbanklist.dao.AccountDAOImpl;
import userbanklist.entities.Account;
import userbanklist.util.UserAccountUtils;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    private AccountDAO accountDAO = new AccountDAOImpl();

    @Override
    public List<Account> getAll() {
        return accountDAO.getAll();
    }

    @Override
    public int getSum() {
        return UserAccountUtils.getSumAccounts(accountDAO.getAll());
    }
}
