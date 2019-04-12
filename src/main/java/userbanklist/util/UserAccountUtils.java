package userbanklist.util;

import userbanklist.entities.Account;

import java.util.Comparator;
import java.util.List;

public class UserAccountUtils {
    public static int getRichestId(List<Account> list) {
        return list.stream()
                .max(Comparator.comparingInt(Account::getAccount))
                .orElse(null)
                .getId();
    }

    public static int getSumAccounts(List<Account> list) {
        return list.stream()
                .mapToInt(value -> value.getAccount())
                .sum();
    }

}
