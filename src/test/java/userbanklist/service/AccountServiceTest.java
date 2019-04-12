package userbanklist.service;

import org.junit.Test;
import userbanklist.entities.Account;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AccountServiceTest {
    private static List<Account> list = new ArrayList<>();
    private static final int SUM = 133210;

    static {
        list.add(new Account(1, 10000, 1));
        list.add(new Account(2, 100, 2));
        list.add(new Account(3, 1000, 3));
        list.add(new Account(4, 100000, 4));
        list.add(new Account(5, 10000, 5));
        list.add(new Account(6, 1000, 6));
        list.add(new Account(7, 10, 7));
        list.add(new Account(8, 100, 8));
        list.add(new Account(9, 10000, 9));
        list.add(new Account(10, 1000, 10));
    }


    @Test
    public void getAll() {
        AccountService service = new AccountServiceImpl();
        assertEquals(list, service.getAll());
    }

    @Test
    public void getSum() {
        AccountService service = new AccountServiceImpl();
        assertEquals(service.getSum(), SUM);
    }
}