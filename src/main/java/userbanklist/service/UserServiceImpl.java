package userbanklist.service;

import userbanklist.dao.UserDAO;
import userbanklist.dao.UserDAOImpl;
import userbanklist.entities.User;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    @Override
    public User getbyId(int id) {
        userDAO = new UserDAOImpl();

        return userDAO.getbyId(id);
    }
}
