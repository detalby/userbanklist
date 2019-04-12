package userbanklist.service;

import userbanklist.entities.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAll();

    int getSum();
}
