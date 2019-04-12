package userbanklist.dao;

import userbanklist.entities.Account;

import java.util.List;

public interface AccountDAO {
    List<Account> getAll();
}
