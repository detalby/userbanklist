package userbanklist.dao;

import userbanklist.db.ConnectionManager;
import userbanklist.entities.Account;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {
    private static final String getAllQuery = "SELECT * FROM accounts_list";
    private static List<Account> list = new ArrayList<>();

    @Override
    public List<Account> getAll() {
        try {
            list.removeAll(list);
            ResultSet rs = ConnectionManager.getConnection().prepareStatement(getAllQuery).executeQuery();
            while (rs.next()) {

                list.add(new Account(rs.getInt(1), rs.getInt(2), rs.getInt(3)));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
