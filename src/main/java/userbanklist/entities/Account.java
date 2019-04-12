package userbanklist.entities;

import java.util.Objects;

public class Account {

    private int id;
    private int account;
    private int user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public Account(int id, int account, int user) {
        this.id = id;
        this.account = account;
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account1 = (Account) o;
        return id == account1.id &&
                account == account1.account &&
                user == account1.user;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, account, user);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", account=" + account +
                ", user=" + user +
                '}';
    }
}
