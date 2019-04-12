package userbanklist.service;


import org.junit.Test;

import userbanklist.entities.User;
import userbanklist.util.UserAccountUtils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class UserServiceTest {
    private static List<User> list = new ArrayList<>();

    static {
        list.add(new User(1, "Alex", "Lukashenko"));
        list.add(new User(2, "Nick", "Lukashenko"));
        list.add(new User(3, "Viktor", "Lukashenko"));
        list.add(new User(4, "Darth", "Vader"));
        list.add(new User(5, "Dmitry", "Medvedev"));
        list.add(new User(6, "Kim", "Chen Yn"));
        list.add(new User(7, "Nick", "Moduro"));
        list.add(new User(8, "Mickolai", "Poroshenko"));
        list.add(new User(9, "Donald", "Trump"));
        list.add(new User(10, "Nursultan", "Nazarbaev"));
    }

    private static final User USER = new User(2, "Nick", "Lukashenko");
    private static final int USER_ID = 2;
    private static final int RICH_ID = 4;


    @Test
    public void getbyId() {
        UserService service = new UserServiceImpl();
        assertEquals(USER, service.getbyId(USER_ID));

    }

    @Test(expected = NullPointerException.class)
    public void getbyIdNPE() {
        UserService service = new UserServiceImpl();
        service.getbyId(110);
    }

    @Test
    public void getRichest() {
        AccountService accountService = new AccountServiceImpl();
        assertEquals(RICH_ID, UserAccountUtils.getRichestId(accountService.getAll()));
    }
}