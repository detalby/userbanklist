package userbanklist.dao;

import userbanklist.db.ConnectionManager;
import userbanklist.entities.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDAOImpl implements UserDAO {
    private static final String getByIdQuery = "SELECT * FROM Users Where id=?";
    PreparedStatement ps;

    @Override
    public User getbyId(int id) {
        User user = null;
        try {
            ps = ConnectionManager.getConnection().prepareStatement(getByIdQuery);
            ps.setString(1, String.valueOf(id));
            ResultSet rs = ps.executeQuery();
            user = null;
            if (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            rs.close();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user.equals(null) ? null : user;
    }
}
